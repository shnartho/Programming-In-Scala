package com.lab_2
import scala.annotation.tailrec

object SocialNetwork extends App {

  def add(network: Map[String, Set[String]], person: String): Map[String, Set[String]] =
    network + (person -> Set())

  def remove(network: Map[String, Set[String]], person: String): Map[String, Set[String]] = {
    def removeAux(friends: Set[String], networkAcc: Map[String, Set[String]]): Map[String, Set[String]] =
      if (friends.isEmpty) networkAcc
      else removeAux(friends.tail, unfriend(networkAcc, person, friends.head))

    val unfriended = removeAux(network(person), network)
    unfriended - person
  }

  def friend(network: Map[String, Set[String]], a: String, b: String): Map[String, Set[String]] = {
    val friendsA = network(a)
    val friendsB = network(b)

    network + (a -> (friendsA + b)) + (b -> (friendsB + a))
  }

  def unfriend(network: Map[String, Set[String]], a: String, b: String): Map[String, Set[String]] = {
    val friendsA = network(a)
    val friendsB = network(b)

    network + (a -> (friendsA - b)) + (b -> (friendsB - a))
  }

  val empty: Map[String, Set[String]] = Map()
  val network = add(add(empty, "Nayem"), "Juan")
  println(network)
  println(friend(network, "Nayem", "Juan"))
  println(unfriend(friend(network, "Nayem", "Juan"), "Nayem", "Juan"))
  println(remove(friend(network, "Nayem", "Juan"), "Nayem"))

  val people = add(add(add(empty, "Sagor"), "Rafi"), "Arif")
  val sagorArif = friend(people, "Sagor", "Arif")
  val networkTest = friend(sagorArif, "Sagor", "Rafi")

  println(networkTest)

  def nFriends(network: Map[String, Set[String]], person: String): Int =
    if (!network.contains(person)) 0
    else network(person).size

  println("Number of friends of Sagor: " + nFriends(networkTest, "Sagor"))

  def mostFriends(network: Map[String, Set[String]]): String =
    network.maxBy(pair => pair._2.size)._1

  println("Person with most friends: " + mostFriends(networkTest))

  def nPeopleWithNoFriends(network: Map[String, Set[String]]): Int =
    network.count(_._2.isEmpty)

  println("How many people have NO friends: " + nPeopleWithNoFriends(networkTest))

  def socialConnection(network: Map[String, Set[String]], a: String, b: String): Boolean = {
    @tailrec
    def bfs(target: String, consideredPeople: Set[String], discoveredPeople: Set[String]): Boolean = {
      if (discoveredPeople.isEmpty) false
      else {
        val person = discoveredPeople.head
        if (person == target) true
        else if (consideredPeople.contains(person)) bfs(target, consideredPeople, discoveredPeople.tail)
        else bfs(target, consideredPeople + person, discoveredPeople.tail ++ network(person))
      }
    }

    bfs(b, Set(), network(a) + a)
  }

  println("\n" + "----------- Sagor has two friends -----------" )
  println("Social connection between Sagor & Arif: " + socialConnection(networkTest, "Sagor", "Arif"))
  println("Social connection between Sagor & Rafi: " + socialConnection(networkTest, "Sagor", "Rafi"))
  println("Social connection between Juan & Nayem: " + socialConnection(network, "Juan", "Nayem"))

}










