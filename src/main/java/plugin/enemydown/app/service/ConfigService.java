package plugin.enemydown.app.service;

import java.util.List;
import org.springframework.stereotype.Service;
import plugin.enemydown.app.mapper.GameConfigMapper;
import plugin.enemydown.app.mapper.data.GameConfig;
import plugin.enemydown.app.mapper.data.SpawnEnemy;

@Service
public class ConfigService {
  private final GameConfigMapper mapper;

  public ConfigService(GameConfigMapper mapper) {

    this.mapper = mapper;
  }
  public List<GameConfig> searchConfigList(){
    return mapper.selectConfigList();
  }
  public GameConfig searchConfig(String difficulty){
    return mapper.selectConfig(difficulty);
  }
  public List<SpawnEnemy> searchSpawnEnemyList(String difficulty){
    return mapper.selectSpawnEnemyList(difficulty);
  }
  public GameConfig registerConfig(GameConfig config) throws Exception{
    if(searchConfig(config.getDifficulty()) != null){
      throw new DuplicateConfigException("Its difficulty is registered");
    }else{
    mapper.insertConfig(config);
    return mapper.selectConfig(config.getDifficulty());
  }}
  public List<SpawnEnemy> updateEnemyScore(SpawnEnemy enemy){
    mapper.updateEnemyScore(enemy);
    return mapper.selectSpawnEnemyList(enemy.getDifficulty());
  }
}
