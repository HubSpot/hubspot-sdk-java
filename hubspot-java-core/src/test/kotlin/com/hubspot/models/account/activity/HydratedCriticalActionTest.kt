// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.account.activity

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HydratedCriticalActionTest {

    @Test
    fun create() {
        val hydratedCriticalAction =
            HydratedCriticalAction.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(HydratedCriticalAction.Type.ACCEPTANCE_TEST)
                .userId(0)
                .actingUser("actingUser")
                .countryCode("countryCode")
                .infoUrl("infoUrl")
                .ipAddress("ipAddress")
                .location("location")
                .objectId("objectId")
                .regionCode("regionCode")
                .build()

        assertThat(hydratedCriticalAction.id()).isEqualTo("id")
        assertThat(hydratedCriticalAction.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(hydratedCriticalAction.type())
            .isEqualTo(HydratedCriticalAction.Type.ACCEPTANCE_TEST)
        assertThat(hydratedCriticalAction.userId()).isEqualTo(0)
        assertThat(hydratedCriticalAction.actingUser()).contains("actingUser")
        assertThat(hydratedCriticalAction.countryCode()).contains("countryCode")
        assertThat(hydratedCriticalAction.infoUrl()).contains("infoUrl")
        assertThat(hydratedCriticalAction.ipAddress()).contains("ipAddress")
        assertThat(hydratedCriticalAction.location()).contains("location")
        assertThat(hydratedCriticalAction.objectId()).contains("objectId")
        assertThat(hydratedCriticalAction.regionCode()).contains("regionCode")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hydratedCriticalAction =
            HydratedCriticalAction.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(HydratedCriticalAction.Type.ACCEPTANCE_TEST)
                .userId(0)
                .actingUser("actingUser")
                .countryCode("countryCode")
                .infoUrl("infoUrl")
                .ipAddress("ipAddress")
                .location("location")
                .objectId("objectId")
                .regionCode("regionCode")
                .build()

        val roundtrippedHydratedCriticalAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hydratedCriticalAction),
                jacksonTypeRef<HydratedCriticalAction>(),
            )

        assertThat(roundtrippedHydratedCriticalAction).isEqualTo(hydratedCriticalAction)
    }
}
