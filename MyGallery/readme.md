#Welcome to my sample code base for *AnDevCon 2014*.

This application is used to showcase the nuances of configuring your app to
support as many devices as possible in an effective and efficient manner.

This code base is a companion to my slides, located at: http://bit.ly/1fsE8bz

##Structure
This repo has three branches.

/examples/one is the starting point for the first demonstration.
- This demonstration starts out with a single layout file which leads to
inconsistent UIs across different devices, sizes, pixel densities

/examples/two is the starting point for the second demonstration.
- Building off of the where the first example left off, the second demonstration encapsulates
the sizing of your images into dimens files, and uses layout files for structures


/examples/three is the starting point for the third demonstration.
- This example extends the example to start using styles for managing your UIs
as a means for minimizing the locations needed to modify and update your UI.
The example will build out a Card View example around the images.