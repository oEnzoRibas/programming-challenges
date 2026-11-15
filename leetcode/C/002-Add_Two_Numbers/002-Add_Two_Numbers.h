#define nullptr  0

struct ListNode {
    int val;
    struct ListNode *next;
};

struct ListNode* createNode(int val);

struct ListNode* reverseListNode(struct ListNode* l);

void printList(struct ListNode *head);

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2);

struct ListNode* addTwoNumbersRec(
    struct ListNode* l1, 
    struct ListNode* l2, 
    int carry
);