package org.omg.CORBA;


/**
* org/omg/CORBA/WStringSeqHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u77/6540/corba/src/share/classes/org/omg/PortableInterceptor/CORBAX.idl
* Sunday, March 20, 2016 10:01:25 PM PDT
*/


/** An array of WStrings */
public final class WStringSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public WStringSeqHolder ()
  {
  }

  public WStringSeqHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = WStringSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    WStringSeqHelper.write (o, value);
  }

  public TypeCode _type ()
  {
    return WStringSeqHelper.type ();
  }

}
