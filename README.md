## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Introduction to Merkle Tree

Merkle tree is a data structure used for data verification and synchronization.
In this structure all node except for leaf nodes are hash of thier child nodes. All leaf nodes are at same level in the tree.
Merkle tree is used in distributed systems where same data must not be in different places. This is used in blockchain technologies most commonly.

## Architecture of Merkle Tree

Merkle tree has same architecture as binary trees but all leaf nodes are at same level. Each node is a hash of its child nodes, leaf nodes being the exception.
Any hash functions can be used for hashing of data. Hash function maps input to a fixed output. The output is unique so it is very efficient `O(1)` to find data in large dataset

![image](https://user-images.githubusercontent.com/66357015/165552624-5e98498f-1d20-4d1d-9bea-adb7128d19fe.png)

## Algorithm
- Get leaf elemets
- Duplicate last element if odd number of elements are there
- Make new node array
- Add new node to array as hash of two consecutive nodes in one level below it and set them as child nodes. 
- Repeat last step till all elements are hashed
- Repeat last 3 steps till array is of size 1

## Steps

`1`

![image](https://user-images.githubusercontent.com/66357015/165556367-73a07c1b-4641-4033-893d-a06b43ade1db.png)

`2`

![image](https://user-images.githubusercontent.com/66357015/165556476-17f87279-1ecf-455d-ba71-70c163ec85bf.png)

`3`

![image](https://user-images.githubusercontent.com/66357015/165556542-caf8b55b-c544-404e-aef0-d91a1328b0e8.png)

`4`

![image](https://user-images.githubusercontent.com/66357015/165552624-5e98498f-1d20-4d1d-9bea-adb7128d19fe.png)


## Output
![image](https://user-images.githubusercontent.com/66357015/165561292-2cf7f637-6b8a-44e0-9e99-2452eec3b1db.png)

![output_annotation](https://user-images.githubusercontent.com/66357015/165562690-3cb4ea4d-3834-4f03-a3db-b4754f1a4983.png)


## References
- https://brilliant.org/wiki/merkle-tree/
- https://www.geeksforgeeks.org/introduction-to-merkle-tree/ (just the concepts not code)
- https://www.youtube.com/watch?v=fB41w3JcR7U

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
