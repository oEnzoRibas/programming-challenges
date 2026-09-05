"""
This module provides a function to calculate the time remaining, to prepare and to cook a lasagna.

"""

EXPECTED_BAKE_TIME = 40
PREPARATION_TIME = 2

def bake_time_remaining(min_passed):
    """Calculate the bake time remaining.

    :param min_passed: int - baking time already elapsed.
    :return: int - remaining bake time (in minutes) derived from 'EXPECTED_BAKE_TIME'.

    This function takes the actual minutes the lasagna has been in the oven as
    an argument and returns how many minutes the lasagna still needs to bake
    based on the `EXPECTED_BAKE_TIME`.
    """
    return EXPECTED_BAKE_TIME - min_passed
    
def preparation_time_in_minutes(layers):
    """Calculate the preparation cooking time.

    :param layers: int - the number of layers in the lasagna
    :return: int total time elapsed (in minutes) preparing the lasagna.

    This function takes one integer representing the number of lasagna layers and 
    calculates the total elapesed minutes spent cooking the lasagna.
    """
    return PREPARATION_TIME * layers

def elapsed_time_in_minutes(layers, min_passed):
    """Calculate the elapsed cooking time.

    :param layers: int - the number of layers in the lasagna
    :param min_passed: int - elapsed cooking time
    :return: int total time elapsed (in minutes) preparing and cooking.

    This function takes two integers representing the number of lasagna layers and
    the time already spent baking and calculates the total elapesed minutes spent cooking the
    lasagna.
    """
    return preparation_time_in_minutes(layers) + min_passed