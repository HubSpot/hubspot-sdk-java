// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.partnerservices.associations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationUpdateParamsTest {

    @Test
    fun create() {
        AssociationUpdateParams.builder()
            .partnerServiceId("partnerServiceId")
            .toObjectType("toObjectType")
            .toObjectId("toObjectId")
            .associationType("associationType")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AssociationUpdateParams.builder()
                .partnerServiceId("partnerServiceId")
                .toObjectType("toObjectType")
                .toObjectId("toObjectId")
                .associationType("associationType")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("partnerServiceId")
        assertThat(params._pathParam(1)).isEqualTo("toObjectType")
        assertThat(params._pathParam(2)).isEqualTo("toObjectId")
        assertThat(params._pathParam(3)).isEqualTo("associationType")
        // out-of-bound path param
        assertThat(params._pathParam(4)).isEqualTo("")
    }
}
