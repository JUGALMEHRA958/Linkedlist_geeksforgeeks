// Q3 Insert node in Linked list
// Link : https://www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/

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

addToBack(63);
addToBack(6666);
addToFront(22);
addToFront(22222);
display();
