package com.steven.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.steven.lookify.models.Song;
import com.steven.lookify.services.LookifyService;

@Controller
public class LookifyController {
	   private final LookifyService lookifyService;
	    
	    public LookifyController(LookifyService lookifyService) {
	        this.lookifyService = lookifyService;
		    }
	    
		// HOME PAGE THAT SHOWS ALL Song
//	    @RequestMapping("/dashboard")
//	    public String index(@ModelAttribute("song") Song song, Model model) {
//	        List<Song> songs = lookifyService.allSongs();
//	        model.addAttribute("songs", songs);
//	        return "/songs/index.jsp";
//	    }
//	   

		@RequestMapping("/")
		public String index(Model model) {
			return "/songs/index.jsp";
		}
		
		//DASHBOARD ALL SONGS
		@RequestMapping("/dashboard")
		public String dashboard(Model model) {
			List<Song> songs = lookifyService.allSongs();
//			System.out.println(songs);
			model.addAttribute("songs", songs);
			return "/songs/dashboard.jsp";
		}
		
		
		//FIRST DISPLAY ADD NEW PAGE
		@RequestMapping("/songs/new")
		public String addNew(@ModelAttribute("song") Song song, Model model) {
			return "/songs/new.jsp";
		}
		
	    // CREATES NEW SONG
	    @RequestMapping(value="/songs/new", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("song") Song song, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/songs/new.jsp";
	        } else {
	            lookifyService.createSong(song);
	            return "redirect:/dashboard";
	        }
	    }
	    
	    
	    // SHOWS INFO ON ONE SONG
	    @RequestMapping("/songs/{id}")
	    public String showSingleSong(@PathVariable("id") Long id, Model model) {
	    	Song song = lookifyService.findSong(id);
	    	model.addAttribute("song", song);        	
	    	return "/songs/show.jsp";
	    }
	    
	    //DISPLAY EDIT PAGE
	    @RequestMapping("/songs/edit/{id}")
	    public String edit(@PathVariable("id") Long id, Model model) {
	        Song song = lookifyService.findSong(id);
	        model.addAttribute("song", song);
	        return "/songs/edit.jsp";
	    }
	    
	    //MAKE UPDATES FROM EDIT PAGE
	    @RequestMapping(value="/songs/{id}", method=RequestMethod.PUT)
	    public String update(@Valid @ModelAttribute("song") Song song, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/songs/edit.jsp";
	        } else {
	        	lookifyService.createSong(song);
	            return "redirect:/dashboard";
	        }
	    }
	    
		@RequestMapping("/search/topten")
		public String topten(Model model) {
			List<Song> songs = lookifyService.getTopTen();
			model.addAttribute("songs", songs);
			return "/songs/topten.jsp";
		}
	    
	    
	    
		@RequestMapping("/songs/delete/{id}")
		public String delete(@PathVariable("id") Long id) {
			lookifyService.deleteSong(id);
			return "redirect:/dashboard";
		}
	    
		
		
		
//		@RequestMapping("/search/{artist}") //{song.artist}
//		public String searchArtistSong(Model model, @PathVariable("artist") String artist) {
//			List<Song> songs = lookifyService.findByArtistContaining(artist);
//			model.addAttribute("songs", songs);
//			model.addAttribute("searchedWord", artist);
//			return "/songs/search.jsp";
//		}
//		
//		
//		
//		@RequestMapping("/search")
//		public String searching(@RequestParam(value="artist") String searchedWord) {
//			if(searchedWord == null | searchedWord == "") {
//				System.out.println("failed");
//
//				return "redirect:/dashboard";
//			}else {
//				System.out.println("succeed");
//			return "redirect:/search/"+searchedWord;
//			}
//		}

		//THIS IS BETTER FOR A QUICK SEARCH
		@RequestMapping("/search") 
		public String searchArtistSong(@RequestParam("artist") String artist, Model model) {
			List<Song> songs = lookifyService.findByArtistContaining(artist);
			model.addAttribute("songs", songs);
			model.addAttribute("searchedWord", artist);
			return "/songs/search.jsp";
		}
		
		
	    
	    
}
