// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associationsschema

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.crm.associationsschema.BatchInputPublicAssociationDefinitionConfigurationCreateRequest
import com.hubspot_sdk.api.models.crm.associationsschema.PublicAssociationDefinitionConfigurationCreateRequest
import com.hubspot_sdk.api.models.crm.associationsschema.PublicAssociationDefinitionCreateRequest
import com.hubspot_sdk.api.models.crm.associationsschema.PublicAssociationDefinitionUpdateRequest
import com.hubspot_sdk.api.models.crm.associationsschema.labels.LabelBatchCreateParams
import com.hubspot_sdk.api.models.crm.associationsschema.labels.LabelCreateLabelParams
import com.hubspot_sdk.api.models.crm.associationsschema.labels.LabelDeleteLabelParams
import com.hubspot_sdk.api.models.crm.associationsschema.labels.LabelListLabelsParams
import com.hubspot_sdk.api.models.crm.associationsschema.labels.LabelUpdateLabelParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class LabelServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun batchCreate() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val labelService = client.crm().associationsSchema().labels()

        val batchResponsePublicAssociationDefinitionUserConfiguration =
            labelService.batchCreate(
                LabelBatchCreateParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .batchInputPublicAssociationDefinitionConfigurationCreateRequest(
                        BatchInputPublicAssociationDefinitionConfigurationCreateRequest.builder()
                            .addInput(
                                PublicAssociationDefinitionConfigurationCreateRequest.builder()
                                    .category(
                                        PublicAssociationDefinitionConfigurationCreateRequest
                                            .Category
                                            .HUBSPOT_DEFINED
                                    )
                                    .maxToObjectIds(0)
                                    .typeId(0)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        batchResponsePublicAssociationDefinitionUserConfiguration.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createLabel() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val labelService = client.crm().associationsSchema().labels()

        val collectionResponseAssociationSpecWithLabelNoPaging =
            labelService.createLabel(
                LabelCreateLabelParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .publicAssociationDefinitionCreateRequest(
                        PublicAssociationDefinitionCreateRequest.builder()
                            .label("label")
                            .name("name")
                            .inverseLabel("inverseLabel")
                            .build()
                    )
                    .build()
            )

        collectionResponseAssociationSpecWithLabelNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteLabel() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val labelService = client.crm().associationsSchema().labels()

        labelService.deleteLabel(
            LabelDeleteLabelParams.builder()
                .fromObjectType("fromObjectType")
                .toObjectType("toObjectType")
                .associationTypeId(0)
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listLabels() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val labelService = client.crm().associationsSchema().labels()

        val collectionResponseAssociationSpecWithLabelNoPaging =
            labelService.listLabels(
                LabelListLabelsParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .build()
            )

        collectionResponseAssociationSpecWithLabelNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateLabel() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val labelService = client.crm().associationsSchema().labels()

        labelService.updateLabel(
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
        )
    }
}
