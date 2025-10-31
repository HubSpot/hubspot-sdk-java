// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.account.activity

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicApiUserActionEventTest {

    @Test
    fun create() {
        val publicApiUserActionEvent =
            PublicApiUserActionEvent.builder()
                .id("5432653")
                .actingUser(
                    ActingUser.builder().userId(2931299).userEmail("pgibbons@initech.com").build()
                )
                .action("PERFORM")
                .category("LOGIN")
                .occurredAt(OffsetDateTime.parse("2025-01-09T16:05:32.387+00:00"))
                .subCategory("LOGIN_SUCCEEDED")
                .targetObjectId("1")
                .build()

        assertThat(publicApiUserActionEvent.id()).isEqualTo("5432653")
        assertThat(publicApiUserActionEvent.actingUser())
            .isEqualTo(
                ActingUser.builder().userId(2931299).userEmail("pgibbons@initech.com").build()
            )
        assertThat(publicApiUserActionEvent.action()).isEqualTo("PERFORM")
        assertThat(publicApiUserActionEvent.category()).isEqualTo("LOGIN")
        assertThat(publicApiUserActionEvent.occurredAt())
            .isEqualTo(OffsetDateTime.parse("2025-01-09T16:05:32.387+00:00"))
        assertThat(publicApiUserActionEvent.subCategory()).contains("LOGIN_SUCCEEDED")
        assertThat(publicApiUserActionEvent.targetObjectId()).contains("1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicApiUserActionEvent =
            PublicApiUserActionEvent.builder()
                .id("5432653")
                .actingUser(
                    ActingUser.builder().userId(2931299).userEmail("pgibbons@initech.com").build()
                )
                .action("PERFORM")
                .category("LOGIN")
                .occurredAt(OffsetDateTime.parse("2025-01-09T16:05:32.387+00:00"))
                .subCategory("LOGIN_SUCCEEDED")
                .targetObjectId("1")
                .build()

        val roundtrippedPublicApiUserActionEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicApiUserActionEvent),
                jacksonTypeRef<PublicApiUserActionEvent>(),
            )

        assertThat(roundtrippedPublicApiUserActionEvent).isEqualTo(publicApiUserActionEvent)
    }
}
