package org.omg.CosNaming.NamingContextPackage;

/**
* org/omg/CosNaming/NamingContextPackage/NotFoundHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /HUDSON/workspace/8-2-build-linux-amd64/jdk8u77/6540/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Sunday, March 20, 2016 10:01:24 PM PDT
*/

public final class NotFoundHolder implements org.omg.CORBA.portable.Streamable
{
  public NotFound value = null;

  public NotFoundHolder ()
  {
  }

  public NotFoundHolder (NotFound initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NotFoundHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NotFoundHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NotFoundHelper.type ();
  }

}