// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.partnerclients.batch

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCreateDefaultAssociationParamsTest {

    @Test
    fun create() {
        BatchCreateDefaultAssociationParams.builder()
            .fromObjectType("fromObjectType")
            .fromObjectId("fromObjectId")
            .toObjectType("toObjectType")
            .toObjectId("toObjectId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BatchCreateDefaultAssociationParams.builder()
                .fromObjectType("fromObjectType")
                .fromObjectId("fromObjectId")
                .toObjectType("toObjectType")
                .toObjectId("toObjectId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("fromObjectType")
        assertThat(params._pathParam(1)).isEqualTo("fromObjectId")
        assertThat(params._pathParam(2)).isEqualTo("toObjectType")
        assertThat(params._pathParam(3)).isEqualTo("toObjectId")
        // out-of-bound path param
        assertThat(params._pathParam(4)).isEqualTo("")
    }
}
