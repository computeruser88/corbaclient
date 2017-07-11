package NewStudentData;


/**
* NewStudentData/StudentDataHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from NewStudentData.idl
* Friday, March 25, 2016 5:37:20 PM PDT
*/

abstract public class StudentDataHelper
{
  private static String  _id = "IDL:NewStudentData/StudentData:1.0";

  public static void insert (org.omg.CORBA.Any a, NewStudentData.StudentData that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static NewStudentData.StudentData extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (NewStudentData.StudentDataHelper.id (), "StudentData");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static NewStudentData.StudentData read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_StudentDataStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, NewStudentData.StudentData value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static NewStudentData.StudentData narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof NewStudentData.StudentData)
      return (NewStudentData.StudentData)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      NewStudentData._StudentDataStub stub = new NewStudentData._StudentDataStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static NewStudentData.StudentData unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof NewStudentData.StudentData)
      return (NewStudentData.StudentData)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      NewStudentData._StudentDataStub stub = new NewStudentData._StudentDataStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
