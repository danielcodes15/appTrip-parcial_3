package com.sv.appTrip.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sv.appTrip.models.Usuario;
import com.sv.appTrip.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<Usuario> buscarTodos() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario buscarPorId(Integer idUsuario) {
        return usuarioRepository.findById(idUsuario).orElse(null);
    }

    @Override
    public void guardar(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    @Transactional
    public void eliminar(Integer idUsuario) {
        usuarioRepository.findById(idUsuario).ifPresent(usuario -> {
            usuario.getPerfiles().clear();
            usuario.getTrips().forEach(trip -> trip.getUsuarios().remove(usuario));
            usuarioRepository.delete(usuario);
        });
    }
}
