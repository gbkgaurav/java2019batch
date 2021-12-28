## DUE DATE: 28 DECEMBER 2021     ##SUBMITTED ON 28 DECEMBER 2021
 
 
 
 # Stream
 
 Introduced in Java 8, the Stream API is used to process collections of objects. A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
The features of Java stream are –

1. A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
2. Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
3. Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be pipelined. Terminal operations mark the end of the stream and return the result.

## Reading
<div>open the stream
<div>while more data
<div> reading information
<div>close stream
  
  
 ## Writing 
<div>open a stream
<div>while more information
<div>write information
<div>close the stream
The java.io package contains a collection of stream classes that supports above mentioned algorithms.
  
 ## Classification of stream classes 
  In general, a Stream will be an input stream or, an output stream.

1. InputStream − This is used to read data from a source.
2. OutputStream − This is used to write data to a destination.
Based on the data they handle there are two types of streams −

1. Byte Streams − These handle data in bytes (8 bits) i.e., the byte stream classes read/write data of 8 bits. Using these you can store characters, videos, audios, images etc.
2. Character Streams − These handle data in 16 bit Unicode. Using these you can read and write text data only.
  
 <div> It is to be remembered that streams in java are one-way streets.
 <div>  The java.io input and output classes represent the ends of a simple stream.
 <div >For bi-directional conversations, we have to use one of each type of streams.
   
   ## OBJECT STREAM
   Just as data streams support I/O of primitive data types, object streams support I/O of objects. Most, but not all, standard classes support serialization of their objects. Those that do implement the marker interface Serializable. 
   The object stream classes are ObjectInputStream and ObjectOutputStream. These classes implement ObjectInput and ObjectOutput, which are subinterfaces of DataInput and DataOutput. That means that all the primitive data I/O methods covered in Data Streams are also implemented in object streams. 
   So an object stream can contain a mixture of primitive and object values.  The ObjectStreams example illustrates this. ObjectStreams creates the same application as DataStreams, with a couple of changes. 
   First, prices are now BigDecimalobjects, to better represent fractional values. Second, a Calendar object is written to the data file, indicating an invoice date.

   If readObject() doesn't return the object type expected, attempting to cast it to the correct type may throw a ClassNotFoundException. In this simple example, that can't happen, so we don't try to catch the exception. Instead, we notify the compiler that we're aware of the issue by adding ClassNotFoundException to the main method's throws clause.

 
 * Read the object type;
 * Create a blank object of that type;
 * Fill it with the data that we stored in the file.
 * It is entirely possible (if very tedious) to do this by hand. Sun Microsystems developed a powerful mechanism that allows this to be done with much less effort. This mechanism is called object serialization, almost completely automates what was previously a very tedious process.
  
  
  ## Zip File Streams
  <div>   ZipInputStream is a Java class that implements an input stream filter for reading files in the ZIP file format. It has support for both compressed and uncompressed entries. 
  <div>    ZIP is an archive file format that supports lossless data compression. A ZIP file may contain one or more files or directories that may have been compressed.
    
    
  ## FileInputStream Class
  Java FileInputStream class obtains input bytes from a file
  * It is used for reading byte-oriented data (streams of raw bytes) such as image data, audio, video etc. You can also read character-stream data. But, for reading streams of characters, it is recommended to use FileReader
    class. 
    
    ### Helper Methods
   * public void close() throws IOException{ } : This method closes the file output stream. Releases any system resources associated with the file. Throws an IOException.

   * protected void finalize() throws IOException { } : This method cleans up the connection to the file. Ensures that the close method of this file output stream is called when there are no more references to this stream. Throws an IOException.

   *  public int read(int r) throws IOException{ } : This method reads the specified byte of data from the InputStream. Returns an int. Returns the next byte of data and -1 will be returned if it's end of file.

   *  public int read(byte[] r) throws IOException{ } : This method reads r.length bytes from the input stream into an array. Returns the total number of bytes read. If end of file -1 will be returned.

   *  public int available() throws IOException{} : Gives the number of bytes that can be read from this file input stream. Returns an int.
    
    
    
  ## FileOutputStream Class
  Java FileOutputStream is an output stream used for writing data to a file.
  If you have to write primitive values into a file, use FileOutputStream class. You can write byte-oriented as well as character-oriented data through FileOutputStream class. But, for character-oriented data, it is preferred to use FileWriter
  than FileOutputStream.
   FileOutputStream ("C:/java/hello") Following constructor takes a file object to create an output stream object to write the file. 
   First, we create a file object using File method as follows: File f = new File("C:/java/hello"); OutputStream f = new FileOutputStream (f); Once we have OutputStream object in hand, then there is a list of helper methods, which can be used to write to stream or to do other operations on the stream.
    
    ## Helper Methods
   * public void close() throws IOException{ } : This method closes the file output stream. Releases any system resources associated with the file. Throws an IOException.
   * protected void finalize() throws IOException { } : This method cleans up the connection to the file. Ensures that the close method of this file output stream is called when there are no more references to this stream. Throws an IOException.
   * public void write(int w) throws IOException{ } : This methods writes the specified byte to the output stream.
   * public void write(byte[] w) Writes w.length bytes from the mentioned byte array to the OutputStream.


    
  
