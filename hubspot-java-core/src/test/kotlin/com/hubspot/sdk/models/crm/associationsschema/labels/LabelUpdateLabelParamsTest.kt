// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.associationsschema.labels

import com.hubspot.sdk.models.crm.associationsschema.PublicAssociationDefinitionUpdateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LabelUpdateLabelParamsTest {

    @Test
    fun create() {
        LabelUpdateLabelParams.builder()
            .fromObjectType("fromObjectType")
            .toObjectType("toObjectType")
            .publicAssociationDefinitionUpdateRequest(
                PublicAssociationDefinitionUpdateRequest.builder()
                    .associationTypeId(0)
                    .label("label")
                    .inverseLabel("inverseLabel")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LabelUpdateLabelParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .publicAssociationDefinitionUpdateRequest(
                    PublicAssociationDefinitionUpdateRequest.builder()
                        .associationTypeId(0)
                        .label("label")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("fromObjectType")
        assertThat(params._pathParam(1)).isEqualTo("toObjectType")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LabelUpdateLabelParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .publicAssociationDefinitionUpdateRequest(
                    PublicAssociationDefinitionUpdateRequest.builder()
                        .associationTypeId(0)
                        .label("label")
                        .inverseLabel("inverseLabel")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicAssociationDefinitionUpdateRequest.builder()
                    .associationTypeId(0)
                    .label("label")
                    .inverseLabel("inverseLabel")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LabelUpdateLabelParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .publicAssociationDefinitionUpdateRequest(
                    PublicAssociationDefinitionUpdateRequest.builder()
                        .associationTypeId(0)
                        .label("label")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicAssociationDefinitionUpdateRequest.builder()
                    .associationTypeId(0)
                    .label("label")
                    .build()
            )
    }
}
