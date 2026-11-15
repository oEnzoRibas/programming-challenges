#include "002-Add_Two_Numbers.h"
#include <stdio.h>
#include <stdlib.h>

void printList(struct ListNode *head) {
    struct ListNode *current = head;

    while (current != nullptr) {
        printf("%d -> ", current->val);

        current = current->next;
    }

    printf("NULL\n");
}

struct ListNode* createNode(int val) {
    struct ListNode *node = malloc(sizeof(struct ListNode));

    if (node == nullptr) {
        return nullptr;
    }

    node->val = val;
    node->next = nullptr;

    return node;
}

struct ListNode* addTwoNumbersRec(
    struct ListNode* l1, 
    struct ListNode* l2, 
    int carry
) {
    if (l1 == nullptr && l2 == nullptr && carry == 0) {
        return nullptr;
    }

    int nodeSum = carry;
    
    if (l1 != NULL){
        nodeSum += l1->val;
    }

    if (l2 != NULL){
        nodeSum += l2->val;
    }

    struct ListNode* node = createNode(nodeSum % 10);

    if (node == NULL) {
        return NULL;
    }


    struct ListNode* next1 = (l1 != NULL) ? l1->next : NULL;
    struct ListNode* next2 = (l2 != NULL) ? l2->next : NULL;

    node->next = (addTwoNumbersRec(next1, next2, nodeSum/10));    
    
    return node;
}

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    return addTwoNumbersRec(l1,l2,0);
}



int main(){

    struct ListNode *l1 = createNode(1);
    l1->next = createNode(3);
    l1->next->next = createNode(5);

    

    struct ListNode *l2 = createNode(3);
    l2->next = createNode(4);
    l2->next->next = createNode(9);
    
    printList(l1);
    printList(l2);
    
    struct ListNode *l3 = addTwoNumbers(l1,l2);

    printList(l3);
    
    return 0;
}