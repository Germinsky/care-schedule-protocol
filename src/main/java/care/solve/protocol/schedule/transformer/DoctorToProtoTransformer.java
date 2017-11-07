package care.solve.protocol.schedule.transformer;

import care.solve.protocol.schedule.entity.DoctorPublic;
import care.solve.protocol.schedule.entity.ScheduleProtos;
import org.springframework.stereotype.Service;

@Service
public class DoctorToProtoTransformer implements ProtoTransformer<DoctorPublic, ScheduleProtos.DoctorPublic> {

    @Override
    public ScheduleProtos.DoctorPublic transformToProto(DoctorPublic doctor) {

        return ScheduleProtos.DoctorPublic.newBuilder()
                .setDoctorId(doctor.getId())
                .setFirstName(doctor.getFirstName())
                .setLastName(doctor.getLastName())
                .build();
    }

    @Override
    public DoctorPublic transformFromProto(ScheduleProtos.DoctorPublic protoDoctor) {
        return DoctorPublic.builder()
                .id(protoDoctor.getDoctorId())
                .firstName(protoDoctor.getFirstName())
                .lastName(protoDoctor.getLastName())
                .build();
    }
}