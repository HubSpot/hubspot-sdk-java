// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.associationsschema

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
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

internal class LabelServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun batchCreate() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val labelServiceAsync = client.crm().associationsSchema().labels()

        val batchResponsePublicAssociationDefinitionUserConfigurationFuture =
            labelServiceAsync.batchCreate(
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

        val batchResponsePublicAssociationDefinitionUserConfiguration =
            batchResponsePublicAssociationDefinitionUserConfigurationFuture.get()
        batchResponsePublicAssociationDefinitionUserConfiguration.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createLabel() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val labelServiceAsync = client.crm().associationsSchema().labels()

        val collectionResponseAssociationSpecWithLabelNoPagingFuture =
            labelServiceAsync.createLabel(
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

        val collectionResponseAssociationSpecWithLabelNoPaging =
            collectionResponseAssociationSpecWithLabelNoPagingFuture.get()
        collectionResponseAssociationSpecWithLabelNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteLabel() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val labelServiceAsync = client.crm().associationsSchema().labels()

        val future =
            labelServiceAsync.deleteLabel(
                LabelDeleteLabelParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .associationTypeId(0)
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listLabels() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val labelServiceAsync = client.crm().associationsSchema().labels()

        val collectionResponseAssociationSpecWithLabelNoPagingFuture =
            labelServiceAsync.listLabels(
                LabelListLabelsParams.builder()
                    .fromObjectType("fromObjectType")
                    .toObjectType("toObjectType")
                    .build()
            )

        val collectionResponseAssociationSpecWithLabelNoPaging =
            collectionResponseAssociationSpecWithLabelNoPagingFuture.get()
        collectionResponseAssociationSpecWithLabelNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateLabel() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val labelServiceAsync = client.crm().associationsSchema().labels()

        val future =
            labelServiceAsync.updateLabel(
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

        val response = future.get()
    }
}
