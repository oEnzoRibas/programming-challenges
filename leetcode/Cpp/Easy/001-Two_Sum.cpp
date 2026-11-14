#include <iostream>
#include <unordered_map>
#include <vector>

using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> um;

        for (int i = 0; i < nums.size(); i++){
            um.insert({nums[i], i});
        }

        for (int i = 0; i < nums.size(); i++){
            int exp_j = target - nums[i];
            auto it = um.find(exp_j);
            if (it != um.end() && it->second != i) {
                return{i, it->second};
            }
        }
        return {};
    }
};


int main(){
    Solution s;
    vector<int> nums = {2,1,4,12,14,55,9,3,2};
    int target = 26;

    vector<int> result = s.twoSum(nums,target);

    if (result.size() == 2){
        cout << "Indexes are " << result[0] << "," << result[1];
    }else {
        cout << "No match found";
    }
    return 0;
}