package com.steven.authentication.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.steven.authentication.models.Song;
import com.steven.authentication.repositories.LookifyRepository;

@Service
public class LookifyService {

    private final LookifyRepository lookifyRepository;
    
    public LookifyService(LookifyRepository lookifyRepository) {
        this.lookifyRepository = lookifyRepository;
    }

    
    // returns all the Songs
    public List<Song> allSongs() {
        return lookifyRepository.findAll();
    }
    
    // creates a Song
    public Song createSong(Song b) {
        return lookifyRepository.save(b);
    }
    
    // retrieves a Song
    public Song findSong(Long id) {
        Optional<Song> optionalSong = lookifyRepository.findById(id);
        if(optionalSong.isPresent()) {
            return optionalSong.get();
        } else {
            return null;
        }
    }
    
    public void deleteSong(Long id) {
    	lookifyRepository.deleteById(id);
    }
   
    
	public List<Song> getTopTen(){
		return lookifyRepository.findTop10ByOrderByRatingDesc();
	}

	
//	public List<Song> getSearchSongs(String artist){
//		return lookifyRepository.findByArtist(artist);
//	}
    
	//Find song by artist containing
	public List<Song> findByArtistContaining(String search){
		return lookifyRepository.findByArtistContaining(search);
	}
    
    
}
