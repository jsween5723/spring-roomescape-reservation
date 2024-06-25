package roomescape.infra.time;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import roomescape.domain.time.ReservationTime;

@Component
class ReservationTimeRowMapper implements RowMapper<ReservationTime> {

  @Override
  public ReservationTime mapRow(ResultSet rs, int rowNum) throws SQLException {
    return new ReservationTime(rs.getLong("id"), rs.getTime("start_at").toLocalTime());
  }
}