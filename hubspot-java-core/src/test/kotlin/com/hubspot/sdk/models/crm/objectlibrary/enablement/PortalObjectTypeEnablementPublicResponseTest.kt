// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.objectlibrary.enablement

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortalObjectTypeEnablementPublicResponseTest {

    @Test
    fun create() {
        val portalObjectTypeEnablementPublicResponse =
            PortalObjectTypeEnablementPublicResponse.builder()
                .enablementByObjectTypeId(
                    PortalObjectTypeEnablementPublicResponse.EnablementByObjectTypeId.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()

        assertThat(portalObjectTypeEnablementPublicResponse.enablementByObjectTypeId())
            .isEqualTo(
                PortalObjectTypeEnablementPublicResponse.EnablementByObjectTypeId.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portalObjectTypeEnablementPublicResponse =
            PortalObjectTypeEnablementPublicResponse.builder()
                .enablementByObjectTypeId(
                    PortalObjectTypeEnablementPublicResponse.EnablementByObjectTypeId.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .build()

        val roundtrippedPortalObjectTypeEnablementPublicResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portalObjectTypeEnablementPublicResponse),
                jacksonTypeRef<PortalObjectTypeEnablementPublicResponse>(),
            )

        assertThat(roundtrippedPortalObjectTypeEnablementPublicResponse)
            .isEqualTo(portalObjectTypeEnablementPublicResponse)
    }
}
