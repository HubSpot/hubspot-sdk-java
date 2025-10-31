// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class V4UpdateParamsTest {

    @Test
    fun create() {
        V4UpdateParams.builder()
            .objectType("objectType")
            .objectId("objectId")
            .toObjectType("toObjectType")
            .toObjectId("toObjectId")
            .addBody(
                AssociationSpec1.builder()
                    .associationCategory(AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED)
                    .associationTypeId(0)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            V4UpdateParams.builder()
                .objectType("objectType")
                .objectId("objectId")
                .toObjectType("toObjectType")
                .toObjectId("toObjectId")
                .addBody(
                    AssociationSpec1.builder()
                        .associationCategory(AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED)
                        .associationTypeId(0)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        assertThat(params._pathParam(1)).isEqualTo("objectId")
        assertThat(params._pathParam(2)).isEqualTo("toObjectType")
        assertThat(params._pathParam(3)).isEqualTo("toObjectId")
        // out-of-bound path param
        assertThat(params._pathParam(4)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            V4UpdateParams.builder()
                .objectType("objectType")
                .objectId("objectId")
                .toObjectType("toObjectType")
                .toObjectId("toObjectId")
                .addBody(
                    AssociationSpec1.builder()
                        .associationCategory(AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED)
                        .associationTypeId(0)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                AssociationSpec1.builder()
                    .associationCategory(AssociationSpec1.AssociationCategory.HUBSPOT_DEFINED)
                    .associationTypeId(0)
                    .build()
            )
    }
}
