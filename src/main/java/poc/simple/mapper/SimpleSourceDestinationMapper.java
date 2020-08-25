package poc.simple.mapper;

import org.mapstruct.Mapper;
import poc.simple.dto.SimpleDestination;
import poc.simple.dto.SimpleSource;

@Mapper
public interface SimpleSourceDestinationMapper {
    SimpleDestination sourceToDestination(SimpleSource source);
    SimpleSource destinationToSource(SimpleDestination destination);
}
