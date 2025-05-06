import './App.css';
import api from './api/axiosConfig';
import { useState, useEffect } from 'react';
import Layout from './components/Layout';
import { Routes, Route } from 'react-router-dom';
import Home from './components/home/Home';
import Header from './components/header/Header'



function App() {
  const [movies, setMovies] = useState([]);

  const getMovies = async () => {
    try {
      const response = await api.get("/api/v1/movies");

      // Log completo dos dados recebidos
      console.log("Dados da API:", {
        status: response.status,
        quantidade: response.data.length,
        primeiroFilme: response.data[0] // Mostra apenas o primeiro para exemplo
      });

      setMovies(response.data);
    } catch (err) {
      console.error("Erro na requisição:", {
        mensagem: err.message,
        url: err.config.url,
        status: err.response?.status
      });
    }
  };

  useEffect(() => {
    console.log("Componente montado - iniciando busca de filmes");
    getMovies();
  }, []);

  return (
    <div className="App">
      {movies.map((movie) => {
        // Log de debug para cada filme
        console.log(`Renderizando filme: ${movie.title} (ID: ${movie.id})`);

        return (
          <div key={movie.id}>
            <h2>{movie.title}</h2>
            {movie.imdbId && <p>IMDb ID: {movie.imdbId}</p>}
          </div>
        );
      })}
      <Header />

      <Routes>
        <Route path="/" element={<Layout />}>
          <Route path="/" element={<Home movies={movies} />}></Route>
        </Route>
      </Routes>
    </div >
  );
}

export default App;
