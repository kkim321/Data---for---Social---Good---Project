# Data---for---Social---Good---Project
My project for Unit 3 APCSA.
# Unit 3 - Data for Social Good Project 

## Introduction 

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need. 

## Requirements 

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program: 
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors. 
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about. 
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs. 
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset). 
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions. 

## User Story 

Include your User Story you analyzed for your project here. Your User Story should have the following format: 

> As an [animal shelter employee], <br> 
> I want to [identify a dog that possible owners want to adopt that fit their desires], <br> 
> so that I can [place them in proper homes]. 

## Dataset 

Include a hyperlink to the source of your dataset used for this project. Additionally, provide a short description of each column used from the dataset, and the data type. 

DataSet: https://docs.google.com/spreadsheets/d/1isckUXXUpay4Xng2g0bmo4tPM7HQj6QtfoWXrFPGWQc/edit?usp=sharing 

- breed (String) - breed of dog
 - age (int) - age of dog
 - color (String) - color of dog
 - size (String) - size of dog
 - healthCondition (String) - health conditon of dog
 - adoptionFee (int) - adoption fee of dog

## UML Diagram 

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get display on this README. 

![UML Diagram for my project] https://docs.google.com/drawings/d/1fIr-jy5IzltQi8dBZhfyFNh3t1M9_qOXGcgJ7Lb62HU/edit?usp=sharing  

## Description 

Write a description of your project here. In your description, include as many vocab words from our class to explain your User Story, the chosen dataset and how your project addressed that users goals. If your project used the Scanner class for user input, explain how the user will interact with your project.

Our User Story is to print a series of dogs based off the User's inputs in order to place them in a perfect home. We want to be able to give our furry friends a home to possible adopters based off what best suits to their liking. For our dataset, it includes the dog's breed, age, adoption fee, health condition, size, weight, and color. This data set is from kraggle.com which we then filtered some of the data in order to make a solid, organized adoption center. It allows the user to have multiple different options of a dog to decide which one they would like to adopt. The user will interact with our project by being asked to choose a dog breed: Gold Retriver, Poodle, or a Labrador, then the size of the dog: Small, medium, or large. Once they input their desires, our code will print out a list of dogs that meet the criteria.
