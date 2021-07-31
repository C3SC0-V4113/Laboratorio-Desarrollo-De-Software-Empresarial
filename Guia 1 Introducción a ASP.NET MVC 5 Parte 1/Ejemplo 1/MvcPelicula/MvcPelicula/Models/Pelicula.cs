using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace MvcPelicula.Models
{
    public class Pelicula
    {
        public int ID { get; set; }
        public string Titulo { get; set; }
        public DateTime FechaLanzamiento { get; set; }
        public string Genero { get; set; }
        public decimal Precio { get; set; }
    }
}