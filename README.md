# Project 1.

This is the high-level project document for Project P1-Markov-GenAI in CompSci 201 at Duke University, Fall 2026.

## Project Overview

For complete project details including git, programming tasks, and analysis questions, see [the _details_ document](docs/details.md). This `README` document supplies a high-level overview of what the project is about, including early engagement points.


## Conceptual and Historical Introduction

Random Markov processes are widely used in Computer Science and in analyzing different forms of data. This project offers an 
occasionally amusing look at a *generative AI model* for creating realistic looking text in a data-driven way by training a model. 
You'll build a simple,  brute force model and a more efficient version as Project 1 and then program and deal with a classification problem after training models as Project 2.

Generative models of the sort you will build are of great interest to researchers in artificial intelligence and machine learning generally, and especially those in the field of *natural language processing* (the use of algorithmic and statistical AI/ML techniques on human language). One recent and powerful example of such text-generation model via statistical machine learning program is the [OpenAI GPT project](https://openai.com/blog/chatgpt). In this
project you'll be creating what are reasonably and historically called _small language models_ as opposed to the _large language models_ (LLMs) behind ChatGPT, Claude, Gemini, and more.

### Historical details of this assignment (optional, Engagement points)

The historical and literary references below can be read for optional enagagement points by filling out the questions accessible via this form **by 11:59 pm Thursday 9/17**: [https://forms.cloud.microsoft/r/FHVhBWV8Tu](https://forms.cloud.microsoft/r/FHVhBWV8Tu). This doesn't involve coding for the project, but you do earn six engagement points
 *without looking at or writing code*! 

This assignment has its roots in several places. The true mathematical roots are from a 1948 monolog by Claude Shannon, 
[A Mathematical Theory of Communication](https://people.math.harvard.edu/~ctm/home/text/others/shannon/entropy/entropy.pdf) which discusses in detail the mathematics and intuition behind this assignment. In particular, the `BaseMarkovModel` uses the approach Shannon describes below (for words rather than letters):

> To construct [a Markov model of order 1], for example, one opens a book at random and selects a word at random on the page. 
This letter is recorded. The book is then opened to another page and one reads until this word is encountered. The succeeding 
word is then recorded. Turning to another page this second word is searched for and the succeeding word recorded, etc. It would be 
interesting if further approximations could be constructed, but the labor involved becomes enormous at the next stage.

(See early *two engagement points*, find something interesting about Claude Shannon: [https://forms.cloud.microsoft/r/FHVhBWV8Tu](https://forms.cloud.microsoft/r/FHVhBWV8Tu). 

You can see Shannon's ideas expressed in the so-called [_Infinite Monkey Theorem_](https://en.wikipedia.org/wiki/Infinite_monkey_theorem) which, in turn, is the basis for a somewhat amusing or arguably disturbing short story named _Inflexible Logic_ now found in pages 91-98 from [_Fantasia Mathematica (Google Books)_](http://books.google.com/books?id=9Xw8tMEmXncC&printsec=frontcover&pritnsec=frontcover#PPA91,M1) and reprinted from a 
[1940 New Yorker story called by Russell Maloney](https://www.newyorker.com/magazine/1940/02/03/inflexible-logic). For four engagement points, read this short story and 
the Wikipedia article linked above and answer the questions in the (same as above) form: https://forms.cloud.microsoft/r/FHVhBWV8Tu. You must indicate that you 
actually read, and did not ask an LLM to summarize
(you will know whether that's true). *This early engagement must be completed by the 9/17.


This assignment has its roots in a Nifty Assignment designed by Joe Zachary from U. Utah, assignments from Princeton designed by 
Kevin Wayne and others, and the work done at Duke starting with Owen Astrachan and continuing with Jeff Forbes, Salman Azhar, Brandon Fain, 
and the UTAs from Compsci 201.

This new version of Markov leads into Project 2 which is Markov Classification. That's new starting in Fall 2025 and continuing through this semester.


## General Work for this project

Your goal is to create two working versions of the code started in the `BaseMarkovModel` class. As you'll see below, you'll complete the class `SimpleMarkovModel`. You'll build on this code with a more efficient version `HashMarkovModel`. The learning goals for this project include:

- Understand _inheritance_ in object-oriented Java programs and the _is-a_ relationship.
- Understand `Map` and `HashMap` and the basics of the abstract data type map or dictionary.
- Understand Unit testing using the `JUnit` libraries.
- Use both empirical and analtyical tests to measure performance.

For details on how to proceed, see the [the _details_ document](docs/details.md).



## Submitting and Grading
You will submit the assignment on Gradescope. You can access Gradescope through the tab on Canvas. 
Please take note that changes/commits on GitLab are NOT automatically synced to Gradescope. 
You are welcome to submit as many times as you like, only the most recent submission will count for a grade. You'll submit once
for P1, and once for analysis.

Don't forget to upload a PDF for the analysis part of this assignment and mark where you answer each question. This is a separate submission in Gradescope.


### Grading

| Section.  | points |
|-----------|--------|
| SimpleMarkovModel  | 6   |
| HashMarkovModel | 8 |
| Analysis  | 12  |
