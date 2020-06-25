
$.blockUI();

function drawMovieDetailHTML(film_details){
	 
	let html = `<div class="tab-pane fade" id="${film_details.episode_id}" role="tabpanel" aria-labelledby="v-pills-home-tab">
			<ul>
				<li><b>Resumen : </b>${film_details.opening_crawl}</li>
				<li><b>Director : </b>${film_details.director}</li>
				<li><b>Productor : </b>${film_details.producer}</li>
				<li><b>Fecha de lanzamiento : </b>${film_details.release_date}</li>
			</ul>
		</div>`;
	return html;
}

$('#moviesContainer').on('click', 'a', e => {
	  e.preventDefault();
	  $("#v-pills-tabContent .tab-pane").removeClass("active").removeClass("show");
	  let id = '#' + $(e.currentTarget).attr("href");
	  $(id).tab('show');
});

let arrayFilms = [];

fetch('http://localhost:8888/peliculas')
.then((data) => data.json())
.then((data) => {
	arrayFilms = data.results;
	if(data.results.length>0){
		let films_list_html = '';
		let films_details_html = '';
		data.results.forEach(element =>{
			films_list_html += `<a class="nav-link" data-toggle="pill" href="${element.episode_id}" role="tab" aria-controls="v-pills-home" aria-selected="false">${element.title}</a>`;
			films_details_html += drawMovieDetailHTML(element);				
		});
		$("#v-pills-tab").html(films_list_html);
		$("#v-pills-tabContent").html(films_details_html);
	}
		
})
.then(() => $("#moviesContainer a").first().click())
.then($.unblockUI);


