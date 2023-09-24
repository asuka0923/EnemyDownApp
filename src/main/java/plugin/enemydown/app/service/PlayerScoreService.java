package plugin.enemydown.app.service;

import java.util.List;
import org.springframework.stereotype.Service;
import plugin.enemydown.app.mapper.PlayerScoreMapper;
import plugin.enemydown.app.mapper.data.GameConfig;
import plugin.enemydown.app.mapper.data.PlayerScore;

@Service
public class PlayerScoreService {
  private final PlayerScoreMapper mapper;

  public PlayerScoreService(PlayerScoreMapper mapper) {
    this.mapper = mapper;
  }

  public List<PlayerScore> searchPlayerScoreList(){
    return mapper.selectPlayerScoreList();
  }

}
