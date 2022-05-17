// Q3 Insert node in Linked list
// Link : https://www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/

// In this post, methods to insert a new node in linked list are discussed. A node can be added in three ways
// 1) At the front of the linked list
// 2) After a given node.
// 3) At the end of the linked list.

var head;

class Node {
  constructor(data) {
    this.data = data;
    this.next = null;
  }
}

function display() {
  var temp = head;
  while (temp != null) {
    console.log(temp.data);
    temp = temp.next;
  }
}

function addToFront(data) {
  var node = new Node(data);
  if (head == null) {
    head = node;
  } else {
    node.next = head;
    head = node;
  }
}

function addToBack(data) {
  var node = new Node(data);
  temp = head;
  // addToBack;
  if (head == null) {
    head = node;
  } else {
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = node;
  }
}

function addAfterParticualarNode(data, afterThis) {
  console.log(
    "Data to add after this is  " + data + "  after This is  " + afterThis
  );
  if (checkIfExist(afterThis) == true) {
    console.log("Data exist              \n");
    var newNode = new Node(data);
    var temp = head;
    while (temp.data != afterThis) {
      temp = temp.next;
    }
    newNode.next = temp.next;
    temp.next = newNode;
  } else {
    console.log("Not exist");
  }
}

function checkIfExist(datatocheck) {
  var temp = head;
  while (temp != null) {
    if (temp.data == datatocheck) {
      return true;
    } else {
      temp = temp.next;
    }
  }
  return false;
}

addToBack(63);
addToBack(6666);
addToFront(22);
addToFront(22222);
addAfterParticualarNode(11111, 22);
display();
