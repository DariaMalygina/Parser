import java.util.LinkedList;
import java.util.List;

public class UnitScript {
    private int unitId;
    private float speed;
    private List<UnitPosition> positions;

    public UnitScript(int unitId, float speed) {
        this.unitId = unitId;
        this.speed = speed;
        this.positions = new LinkedList<>();
    }

    public void appendPosition(UnitPosition position) {
        positions.add(position);
    }

    public int getUnitId() {
        return unitId;
    }

    public float getSpeed() {
        return speed;
    }

    public List<UnitPosition> getPositions() {
        return positions;
    }

    @Override
    public String toString() {

        return "unitId: "+unitId+" speed: "+speed+" positions: "+positions.toString()+"\n";
    }
}
