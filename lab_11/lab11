
-------------task 1 ---------------------

 abstract class MyOption[+T] {
    def map[B](transformer: T => B): MyOption[B]
    def flatMap[B](transformer: T => MyOption[B]): MyOption[B]
    def filter(predicate: T => Boolean): MyOption[T]
  }

  case object MyOptionNone extends MyOption[Nothing] {
    override def map[B](transformer: Nothing => B): MyOption[B] = this
    override def flatMap[B](transformer: Nothing => MyOption[B]): MyOption[B] = this
    override def filter(predicate: Nothing => Boolean): MyOption[Nothing] = this
  }

  case class MyOptionSome[+T](value: T) extends MyOption[T] {
    override def map[B](transformer: T => B): MyOption[B] = MyOptionSome(transformer(value))
    override def flatMap[B](transformer: T => MyOption[B]): MyOption[B] = transformer(value)
    override def filter(predicate: T => Boolean): MyOption[T] = if (predicate(value)) this else MyOptionNone
  }
  
  --------------------------task 2 -----------------------------
  import scala.util.Random
  
    val config: Map[String, String] = Map(
    // fetched from elsewhere
    "host" -> "176.45.36.1",
    "port" -> "80"
  )

  class Connection {
    def connect = "Connected" // connect to some server
  }

  object Connection {
    val random = new Random(System.nanoTime())

    def apply(host: String, port: String): Option[Connection] =
      if (random.nextBoolean()) Some(new Connection)
      else None
  }

  // try to establish a connection, if so - print the connect method
  val host = config.get("host")
  val port = config.get("port")

  val h = host.get
  val p = port.get
  val con = Connection(h, p)
  con.get.connect
