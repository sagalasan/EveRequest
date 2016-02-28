package eveapi.engine;

import eveapi.XmlRequest;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.net.ssl.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * Created by sagalasan on 2/28/16.
 */
public class RequestEngine
{
  private static final Logger logger = LoggerFactory.getLogger(RequestEngine.class);

  private static final HostnameVerifier hostnameVerifier = new HostnameVerifier()
  {
    public boolean verify(String hostname, SSLSession session)
    {
      return true;
    }
  };

  private static SSLSocketFactory sslSocketFactory;

  static
  {
    try
    {
      final SSLContext context = SSLContext.getInstance("SSL");

      TrustManager tm = new X509TrustManager()
      {
        public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException
        {
        }

        public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException
        {
        }

        public X509Certificate[] getAcceptedIssuers()
        {
          return null;
        }
      };

      context.init(null, new TrustManager[]{tm}, null);
      sslSocketFactory = context.getSocketFactory();
    } catch (Exception e)
    {
      logger.error(e.getMessage(), e);
      sslSocketFactory = null;
    }
  }

  public static byte[] xmlRequest(XmlRequest xmlRequest)
  {
    try
    {
      URL url = new URL(xmlRequest.buildUri());
      URLConnection connection = url.openConnection();
      InputStream inputStream = connection.getInputStream();
      return IOUtils.toByteArray(inputStream);
    }
    catch (IOException e)
    {
      logger.error(e.getMessage());
    }

    return null;
  }
}
