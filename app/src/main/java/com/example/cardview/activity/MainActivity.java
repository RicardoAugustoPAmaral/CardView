package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);
        //Definir um Layout

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(RecyclerView.HORIZONTAL);

        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);

        recyclerPostagem.setLayoutManager(layoutManager);

        //Inicializar a lista de postagens
        postagens = new ArrayList<>();

        //Definir Adapter

        this.prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);

        recyclerPostagem.setAdapter(adapter);


    }

    public void  prepararPostagens(){
        Postagem postagem;
        postagem = new Postagem("Ricardo Amaral","Viagem legal!!",R.drawable.imagem4);
        this.postagens.add(postagem);
        postagem = new Postagem("Ricardo Amaral","Viagem legal!!",R.drawable.imagem1);
        this.postagens.add(postagem);
        postagem= new Postagem("Ricardo Amaral","Viagem legal!!",R.drawable.imagem2);
        this.postagens.add(postagem);
        postagem= new Postagem("Ricardo Amaral","Viagem legal!!",R.drawable.imagem3);
        this.postagens.add(postagem);


    }

}
