// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.featureflags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortalFlagStateBatchDeleteRequestTest {

    @Test
    fun create() {
        val portalFlagStateBatchDeleteRequest =
            PortalFlagStateBatchDeleteRequest.builder().addPortalId(0).build()

        assertThat(portalFlagStateBatchDeleteRequest.portalIds()).containsExactly(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portalFlagStateBatchDeleteRequest =
            PortalFlagStateBatchDeleteRequest.builder().addPortalId(0).build()

        val roundtrippedPortalFlagStateBatchDeleteRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portalFlagStateBatchDeleteRequest),
                jacksonTypeRef<PortalFlagStateBatchDeleteRequest>(),
            )

        assertThat(roundtrippedPortalFlagStateBatchDeleteRequest)
            .isEqualTo(portalFlagStateBatchDeleteRequest)
    }
}
