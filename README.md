# Code Katas for Java

> A programming kata is an exercise which helps a programmer hone his skills
> through practice and repetition.

## Kata 1 &ndash; [Fizz Buzz][kata-1] (Easy)

Return "fizz", "buzz" or "fizzbuzz".

For a given natural number greater than zero return:

- "fizz"" if the number is dividable by 3
- "buzz" if the number is dividable by 5
- "fizzbuzz" if the number is dividable by 15
- the same number if no other requirement is fulfilled

## Kata 2 &ndash [Berlin Clock][kata-2] (Easy)

Create a representation of the Berlin Clock for a given time (hh::mm:ss).

The Berlin Uhr (Clock) is a rather strange way to show the time. On the top of
the clock there is a yellow lamp that blinks on/off every two seconds. The time
is calculated by adding rectangular lamps.

The top two rows of lamps are red. These indicate the hours of a day. In the top
row there are 4 red lamps. Every lamp represents 5 hours. In the lower row of
red lamps every lamp represents 1 hour. So if two lamps of the first row and
three of the second row are switched on that indicates 5+5+3=13h or 1 pm.

The two rows of lamps at the bottom count the minutes. The first of these rows
has 11 lamps, the second 4. In the first row every lamp represents 5 minutes. In
this first row the 3rd, 6th and 9th lamp are red and indicate the first quarter,
half and last quarter of an hour. The other lamps are yellow. In the last row
with 4 lamps every lamp represents 1 minute.

The lamps are switched on from left to right.

- Y = Yellow
- R = Red
- O = Off

Detailed explanation with piucture at [Wikipedia][berlin-clock].

[kata-1]:       http://technologyconversations.com/2014/03/12/java-tutorial-through-katas-fizz-buzz-easy/
[kata-2]:       http://technologyconversations.com/2014/02/25/java-8-tutorial-through-katas-berlin-clock-easy/
[berlin-clock]: https://en.wikipedia.org/wiki/Mengenlehreuhr
