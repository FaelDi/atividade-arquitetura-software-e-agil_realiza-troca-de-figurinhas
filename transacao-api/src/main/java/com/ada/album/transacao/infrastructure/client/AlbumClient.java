package com.ada.album.transacao.infrastructure.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("albuns")
public interface AlbumClient {

}
