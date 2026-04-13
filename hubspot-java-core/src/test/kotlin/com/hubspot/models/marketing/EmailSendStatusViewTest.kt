// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailSendStatusViewTest {

    @Test
    fun create() {
        val emailSendStatusView =
            EmailSendStatusView.builder()
                .status(EmailSendStatusView.Status.CANCELED)
                .statusId("statusId")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventId(
                    EventIdView.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .message("message")
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .sendResult(EmailSendStatusView.SendResult.ADDRESS_LIST_BOMBED)
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(emailSendStatusView.status()).isEqualTo(EmailSendStatusView.Status.CANCELED)
        assertThat(emailSendStatusView.statusId()).isEqualTo("statusId")
        assertThat(emailSendStatusView.completedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailSendStatusView.eventId())
            .contains(
                EventIdView.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(emailSendStatusView.message()).contains("message")
        assertThat(emailSendStatusView.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailSendStatusView.sendResult())
            .contains(EmailSendStatusView.SendResult.ADDRESS_LIST_BOMBED)
        assertThat(emailSendStatusView.startedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailSendStatusView =
            EmailSendStatusView.builder()
                .status(EmailSendStatusView.Status.CANCELED)
                .statusId("statusId")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventId(
                    EventIdView.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .message("message")
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .sendResult(EmailSendStatusView.SendResult.ADDRESS_LIST_BOMBED)
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedEmailSendStatusView =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailSendStatusView),
                jacksonTypeRef<EmailSendStatusView>(),
            )

        assertThat(roundtrippedEmailSendStatusView).isEqualTo(emailSendStatusView)
    }
}
