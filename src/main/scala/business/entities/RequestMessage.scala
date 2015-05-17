package business.entities

abstract class RequestMessage extends Serializable
case class AddIndebtedRequest(i: Indebted) extends RequestMessage
case class AddPropertyRequest(i: Indebted, p : Property) extends RequestMessage

