package lombok.basic;

import lombok.Builder;
import lombok.Data;

@Data				// @Getter, @Setter, @ToString
					// @RequiredArgsConstructor
					// @EqualsAndHashCode
@Builder
public class Pikachu {
	// 필수 샌성자로 지정되려면, @NonNull 또는 final 선언
	int energy;
	String type;
	int level;
}
