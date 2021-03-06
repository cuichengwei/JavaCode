/*
 * Copyright (c) 1999, 2001, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.omg.CORBA;


/**
* The Helper for <tt>Current</tt>.  For more information on
* Helper files, see <a href="doc-files/generatedfiles.html#helper">
* "Generated Files: Helper Files"</a>.<P>
* org/omg/CORBA/CurrentHelper.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from ../../../../../src/share/classes/org/omg/PortableServer/corba.idl
* Saturday, July 17, 1999 12:26:21 AM PDT
*/

abstract public class CurrentHelper
{
  private static String  _id = "IDL:omg.org/CORBA/Current:1.0";

  public static void insert (Any a, Current that)
  {
    throw new MARSHAL() ;
  }

  public static Current extract (Any a)
  {
    throw new MARSHAL() ;
  }

  private static TypeCode __typeCode = null;
  synchronized public static TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = ORB.init ().create_interface_tc (CurrentHelper.id (), "Current");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Current read (org.omg.CORBA.portable.InputStream istream)
  {
    throw new MARSHAL() ;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Current value)
  {
    throw new MARSHAL() ;
  }

  public static Current narrow (Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Current)
      return (Current)obj;
    else
      throw new BAD_PARAM ();
  }

}
