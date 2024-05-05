class Node:
    def __init__(self,value):
        self.value=value
        self.next=None
class Linked_List:
    def __init__(self,value):
        new_node=Node(value)
        self.head=new_node
        self.tail=new_node
        self.length=1
    def print_list(self):
        temp=self.head
        while temp is not None:
            print(temp.value) 
            temp=temp.next 
    def appendList(self,value):
        neww_Node=Node(value)
        if self.length==0:
            self.head=neww_Node       
            self.tail=neww_Node
        else:
            self.tail.next=neww_Node
            self.tail=neww_Node
        self.length+=1           

mylist=Linked_List(4) 
mylist.appendList(21)
mylist.appendList(17)
mylist.print_list()          
                
        