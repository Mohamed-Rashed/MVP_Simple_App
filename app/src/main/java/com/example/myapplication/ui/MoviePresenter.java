package com.example.myapplication.ui;

import com.example.myapplication.pojo.MovieModel;

public class MoviePresenter {
    MovieView view;

    public MoviePresenter(MovieView view) {
        this.view = view;
    }
    public MovieModel getmoviefromDataBase(){
        return new MovieModel("cast A Way", "22/10/2000" , 1 , "very sad movie");
    }
    public void getmoviename(){
        view.onGetMovieName(getmoviefromDataBase().getName());
    }
}
