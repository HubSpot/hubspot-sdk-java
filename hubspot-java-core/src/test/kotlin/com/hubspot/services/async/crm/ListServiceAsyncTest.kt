// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm

import com.hubspot.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.core.JsonValue
import com.hubspot.models.crm.lists.BatchInputRecordIdInput
import com.hubspot.models.crm.lists.ListAddAndRemoveMembershipsParams
import com.hubspot.models.crm.lists.ListAddMembershipsFromParams
import com.hubspot.models.crm.lists.ListAddMembershipsParams
import com.hubspot.models.crm.lists.ListCreateRequest
import com.hubspot.models.crm.lists.ListFilterUpdateRequest
import com.hubspot.models.crm.lists.ListFolderCreateRequest
import com.hubspot.models.crm.lists.ListGetByObjectTypeAndNameParams
import com.hubspot.models.crm.lists.ListGetIdMappingParams
import com.hubspot.models.crm.lists.ListGetParams
import com.hubspot.models.crm.lists.ListGetRecordMembershipsParams
import com.hubspot.models.crm.lists.ListGetSizeAndEditsHistoryBetweenParams
import com.hubspot.models.crm.lists.ListListFoldersParams
import com.hubspot.models.crm.lists.ListListParams
import com.hubspot.models.crm.lists.ListMoveFolderParams
import com.hubspot.models.crm.lists.ListMoveRequest
import com.hubspot.models.crm.lists.ListRemoveMembershipsParams
import com.hubspot.models.crm.lists.ListRenameFolderParams
import com.hubspot.models.crm.lists.ListSearchRequest
import com.hubspot.models.crm.lists.ListUpdateListFiltersParams
import com.hubspot.models.crm.lists.ListUpdateListNameParams
import com.hubspot.models.crm.lists.ListUpdateScheduleConversionParams
import com.hubspot.models.crm.lists.MembershipChangeRequest
import com.hubspot.models.crm.lists.PublicAndFilterBranch
import com.hubspot.models.crm.lists.PublicAssociationFilterBranch
import com.hubspot.models.crm.lists.PublicBoolPropertyOperation
import com.hubspot.models.crm.lists.PublicListConversionDate
import com.hubspot.models.crm.lists.PublicListPermissions
import com.hubspot.models.crm.lists.PublicMembershipSettings
import com.hubspot.models.crm.lists.PublicNotAllFilterBranch
import com.hubspot.models.crm.lists.PublicNotAnyFilterBranch
import com.hubspot.models.crm.lists.PublicNumOccurrencesRefineBy
import com.hubspot.models.crm.lists.PublicOrFilterBranch
import com.hubspot.models.crm.lists.PublicPropertyAssociationFilterBranch
import com.hubspot.models.crm.lists.PublicPropertyFilter
import com.hubspot.models.crm.lists.PublicRestrictedFilterBranch
import com.hubspot.models.crm.lists.PublicUnifiedEventsFilterBranch
import com.hubspot.models.crm.lists.RecordIdInput
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ListServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val listCreateResponseFuture =
            listServiceAsync.create(
                ListCreateRequest.builder()
                    .name("name")
                    .objectTypeId("objectTypeId")
                    .processingType("processingType")
                    .customProperties(
                        ListCreateRequest.CustomProperties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .filterBranch(
                        PublicOrFilterBranch.builder()
                            .addFilterBranch(
                                PublicAndFilterBranch.builder()
                                    .addFilterBranch(
                                        PublicNotAllFilterBranch.builder()
                                            .addFilterBranch(
                                                PublicNotAnyFilterBranch.builder()
                                                    .addFilterBranch(
                                                        PublicRestrictedFilterBranch.builder()
                                                            .addFilterBranch(
                                                                PublicUnifiedEventsFilterBranch
                                                                    .builder()
                                                                    .eventTypeId("eventTypeId")
                                                                    .addFilterBranch(
                                                                        PublicPropertyAssociationFilterBranch
                                                                            .builder()
                                                                            .addFilterBranch(
                                                                                PublicAssociationFilterBranch
                                                                                    .builder()
                                                                                    .associationCategory(
                                                                                        "associationCategory"
                                                                                    )
                                                                                    .associationTypeId(
                                                                                        0
                                                                                    )
                                                                                    .addFilterBranch(
                                                                                        PublicOrFilterBranch
                                                                                            .builder()
                                                                                            .filterBranches(
                                                                                                listOf()
                                                                                            )
                                                                                            .filterBranchOperator(
                                                                                                "filterBranchOperator"
                                                                                            )
                                                                                            .filterBranchType(
                                                                                                PublicOrFilterBranch
                                                                                                    .FilterBranchType
                                                                                                    .OR
                                                                                            )
                                                                                            .addFilter(
                                                                                                PublicPropertyFilter
                                                                                                    .builder()
                                                                                                    .filterType(
                                                                                                        PublicPropertyFilter
                                                                                                            .FilterType
                                                                                                            .PROPERTY
                                                                                                    )
                                                                                                    .operation(
                                                                                                        PublicBoolPropertyOperation
                                                                                                            .builder()
                                                                                                            .includeObjectsWithNoValueSet(
                                                                                                                true
                                                                                                            )
                                                                                                            .operationType(
                                                                                                                PublicBoolPropertyOperation
                                                                                                                    .OperationType
                                                                                                                    .BOOL
                                                                                                            )
                                                                                                            .operator(
                                                                                                                "operator"
                                                                                                            )
                                                                                                            .value(
                                                                                                                true
                                                                                                            )
                                                                                                            .build()
                                                                                                    )
                                                                                                    .property(
                                                                                                        "property"
                                                                                                    )
                                                                                                    .build()
                                                                                            )
                                                                                            .build()
                                                                                    )
                                                                                    .filterBranchOperator(
                                                                                        "filterBranchOperator"
                                                                                    )
                                                                                    .filterBranchType(
                                                                                        PublicAssociationFilterBranch
                                                                                            .FilterBranchType
                                                                                            .ASSOCIATION
                                                                                    )
                                                                                    .addFilter(
                                                                                        PublicPropertyFilter
                                                                                            .builder()
                                                                                            .filterType(
                                                                                                PublicPropertyFilter
                                                                                                    .FilterType
                                                                                                    .PROPERTY
                                                                                            )
                                                                                            .operation(
                                                                                                PublicBoolPropertyOperation
                                                                                                    .builder()
                                                                                                    .includeObjectsWithNoValueSet(
                                                                                                        true
                                                                                                    )
                                                                                                    .operationType(
                                                                                                        PublicBoolPropertyOperation
                                                                                                            .OperationType
                                                                                                            .BOOL
                                                                                                    )
                                                                                                    .operator(
                                                                                                        "operator"
                                                                                                    )
                                                                                                    .value(
                                                                                                        true
                                                                                                    )
                                                                                                    .build()
                                                                                            )
                                                                                            .property(
                                                                                                "property"
                                                                                            )
                                                                                            .build()
                                                                                    )
                                                                                    .objectTypeId(
                                                                                        "objectTypeId"
                                                                                    )
                                                                                    .operator(
                                                                                        "operator"
                                                                                    )
                                                                                    .build()
                                                                            )
                                                                            .filterBranchOperator(
                                                                                "filterBranchOperator"
                                                                            )
                                                                            .filterBranchType(
                                                                                PublicPropertyAssociationFilterBranch
                                                                                    .FilterBranchType
                                                                                    .PROPERTY_ASSOCIATION
                                                                            )
                                                                            .addFilter(
                                                                                PublicPropertyFilter
                                                                                    .builder()
                                                                                    .filterType(
                                                                                        PublicPropertyFilter
                                                                                            .FilterType
                                                                                            .PROPERTY
                                                                                    )
                                                                                    .operation(
                                                                                        PublicBoolPropertyOperation
                                                                                            .builder()
                                                                                            .includeObjectsWithNoValueSet(
                                                                                                true
                                                                                            )
                                                                                            .operationType(
                                                                                                PublicBoolPropertyOperation
                                                                                                    .OperationType
                                                                                                    .BOOL
                                                                                            )
                                                                                            .operator(
                                                                                                "operator"
                                                                                            )
                                                                                            .value(
                                                                                                true
                                                                                            )
                                                                                            .build()
                                                                                    )
                                                                                    .property(
                                                                                        "property"
                                                                                    )
                                                                                    .build()
                                                                            )
                                                                            .objectTypeId(
                                                                                "objectTypeId"
                                                                            )
                                                                            .operator("operator")
                                                                            .propertyWithObjectId(
                                                                                "propertyWithObjectId"
                                                                            )
                                                                            .build()
                                                                    )
                                                                    .filterBranchOperator(
                                                                        "filterBranchOperator"
                                                                    )
                                                                    .filterBranchType(
                                                                        PublicUnifiedEventsFilterBranch
                                                                            .FilterBranchType
                                                                            .UNIFIED_EVENTS
                                                                    )
                                                                    .addFilter(
                                                                        PublicPropertyFilter
                                                                            .builder()
                                                                            .filterType(
                                                                                PublicPropertyFilter
                                                                                    .FilterType
                                                                                    .PROPERTY
                                                                            )
                                                                            .operation(
                                                                                PublicBoolPropertyOperation
                                                                                    .builder()
                                                                                    .includeObjectsWithNoValueSet(
                                                                                        true
                                                                                    )
                                                                                    .operationType(
                                                                                        PublicBoolPropertyOperation
                                                                                            .OperationType
                                                                                            .BOOL
                                                                                    )
                                                                                    .operator(
                                                                                        "operator"
                                                                                    )
                                                                                    .value(true)
                                                                                    .build()
                                                                            )
                                                                            .property("property")
                                                                            .build()
                                                                    )
                                                                    .operator(
                                                                        PublicUnifiedEventsFilterBranch
                                                                            .Operator
                                                                            .HAS_COMPLETED
                                                                    )
                                                                    .coalescingRefineBy(
                                                                        PublicNumOccurrencesRefineBy
                                                                            .builder()
                                                                            .type(
                                                                                PublicNumOccurrencesRefineBy
                                                                                    .Type
                                                                                    .NUM_OCCURRENCES
                                                                            )
                                                                            .maxOccurrences(0)
                                                                            .minOccurrences(0)
                                                                            .build()
                                                                    )
                                                                    .pruningRefineBy(
                                                                        PublicNumOccurrencesRefineBy
                                                                            .builder()
                                                                            .type(
                                                                                PublicNumOccurrencesRefineBy
                                                                                    .Type
                                                                                    .NUM_OCCURRENCES
                                                                            )
                                                                            .maxOccurrences(0)
                                                                            .minOccurrences(0)
                                                                            .build()
                                                                    )
                                                                    .build()
                                                            )
                                                            .filterBranchOperator(
                                                                "filterBranchOperator"
                                                            )
                                                            .filterBranchType(
                                                                PublicRestrictedFilterBranch
                                                                    .FilterBranchType
                                                                    .RESTRICTED
                                                            )
                                                            .addFilter(
                                                                PublicPropertyFilter.builder()
                                                                    .filterType(
                                                                        PublicPropertyFilter
                                                                            .FilterType
                                                                            .PROPERTY
                                                                    )
                                                                    .operation(
                                                                        PublicBoolPropertyOperation
                                                                            .builder()
                                                                            .includeObjectsWithNoValueSet(
                                                                                true
                                                                            )
                                                                            .operationType(
                                                                                PublicBoolPropertyOperation
                                                                                    .OperationType
                                                                                    .BOOL
                                                                            )
                                                                            .operator("operator")
                                                                            .value(true)
                                                                            .build()
                                                                    )
                                                                    .property("property")
                                                                    .build()
                                                            )
                                                            .build()
                                                    )
                                                    .filterBranchOperator("filterBranchOperator")
                                                    .filterBranchType(
                                                        PublicNotAnyFilterBranch.FilterBranchType
                                                            .NOT_ANY
                                                    )
                                                    .addFilter(
                                                        PublicPropertyFilter.builder()
                                                            .filterType(
                                                                PublicPropertyFilter.FilterType
                                                                    .PROPERTY
                                                            )
                                                            .operation(
                                                                PublicBoolPropertyOperation
                                                                    .builder()
                                                                    .includeObjectsWithNoValueSet(
                                                                        true
                                                                    )
                                                                    .operationType(
                                                                        PublicBoolPropertyOperation
                                                                            .OperationType
                                                                            .BOOL
                                                                    )
                                                                    .operator("operator")
                                                                    .value(true)
                                                                    .build()
                                                            )
                                                            .property("property")
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .filterBranchOperator("filterBranchOperator")
                                            .filterBranchType(
                                                PublicNotAllFilterBranch.FilterBranchType.NOT_ALL
                                            )
                                            .addFilter(
                                                PublicPropertyFilter.builder()
                                                    .filterType(
                                                        PublicPropertyFilter.FilterType.PROPERTY
                                                    )
                                                    .operation(
                                                        PublicBoolPropertyOperation.builder()
                                                            .includeObjectsWithNoValueSet(true)
                                                            .operationType(
                                                                PublicBoolPropertyOperation
                                                                    .OperationType
                                                                    .BOOL
                                                            )
                                                            .operator("operator")
                                                            .value(true)
                                                            .build()
                                                    )
                                                    .property("property")
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .filterBranchOperator("filterBranchOperator")
                                    .filterBranchType(PublicAndFilterBranch.FilterBranchType.AND)
                                    .addFilter(
                                        PublicPropertyFilter.builder()
                                            .filterType(PublicPropertyFilter.FilterType.PROPERTY)
                                            .operation(
                                                PublicBoolPropertyOperation.builder()
                                                    .includeObjectsWithNoValueSet(true)
                                                    .operationType(
                                                        PublicBoolPropertyOperation.OperationType
                                                            .BOOL
                                                    )
                                                    .operator("operator")
                                                    .value(true)
                                                    .build()
                                            )
                                            .property("property")
                                            .build()
                                    )
                                    .build()
                            )
                            .filterBranchOperator("filterBranchOperator")
                            .filterBranchType(PublicOrFilterBranch.FilterBranchType.OR)
                            .addFilter(
                                PublicPropertyFilter.builder()
                                    .filterType(PublicPropertyFilter.FilterType.PROPERTY)
                                    .operation(
                                        PublicBoolPropertyOperation.builder()
                                            .includeObjectsWithNoValueSet(true)
                                            .operationType(
                                                PublicBoolPropertyOperation.OperationType.BOOL
                                            )
                                            .operator("operator")
                                            .value(true)
                                            .build()
                                    )
                                    .property("property")
                                    .build()
                            )
                            .build()
                    )
                    .listFolderId(0)
                    .listPermissions(
                        PublicListPermissions.builder()
                            .addTeamsWithEditAccess(0)
                            .addUsersWithEditAccess(0)
                            .build()
                    )
                    .membershipSettings(
                        PublicMembershipSettings.builder()
                            .includeUnassigned(true)
                            .membershipTeamId(0)
                            .build()
                    )
                    .build()
            )

        val listCreateResponse = listCreateResponseFuture.get()
        listCreateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val listsByIdResponseFuture =
            listServiceAsync.list(
                ListListParams.builder().includeFilters(true).addListId("string").build()
            )

        val listsByIdResponse = listsByIdResponseFuture.get()
        listsByIdResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val future = listServiceAsync.delete("listId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun addAndRemoveMemberships() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val membershipsUpdateResponseFuture =
            listServiceAsync.addAndRemoveMemberships(
                ListAddAndRemoveMembershipsParams.builder()
                    .listId("listId")
                    .membershipChangeRequest(
                        MembershipChangeRequest.builder()
                            .addRecordIdsToAdd("string")
                            .addRecordIdsToRemove("string")
                            .build()
                    )
                    .build()
            )

        val membershipsUpdateResponse = membershipsUpdateResponseFuture.get()
        membershipsUpdateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun addMemberships() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val membershipsUpdateResponseFuture =
            listServiceAsync.addMemberships(
                ListAddMembershipsParams.builder().listId("listId").addBody("string").build()
            )

        val membershipsUpdateResponse = membershipsUpdateResponseFuture.get()
        membershipsUpdateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun addMembershipsFrom() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val future =
            listServiceAsync.addMembershipsFrom(
                ListAddMembershipsFromParams.builder()
                    .listId("listId")
                    .sourceListId("sourceListId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun batchReadMemberships() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val batchResponseRecordIdWithMembershipsFuture =
            listServiceAsync.batchReadMemberships(
                BatchInputRecordIdInput.builder()
                    .addInput(
                        RecordIdInput.builder()
                            .objectTypeId("objectTypeId")
                            .recordId("recordId")
                            .build()
                    )
                    .build()
            )

        val batchResponseRecordIdWithMemberships = batchResponseRecordIdWithMembershipsFuture.get()
        batchResponseRecordIdWithMemberships.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createFolder() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val listFolderCreateResponseFuture =
            listServiceAsync.createFolder(
                ListFolderCreateRequest.builder()
                    .name("name")
                    .parentFolderId("parentFolderId")
                    .build()
            )

        val listFolderCreateResponse = listFolderCreateResponseFuture.get()
        listFolderCreateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createIdMapping() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val publicBatchMigrationMappingFuture = listServiceAsync.createIdMapping(listOf("string"))

        val publicBatchMigrationMapping = publicBatchMigrationMappingFuture.get()
        publicBatchMigrationMapping.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteFolder() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val future = listServiceAsync.deleteFolder("folderId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteMemberships() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val future = listServiceAsync.deleteMemberships("listId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val listFetchResponseFuture =
            listServiceAsync.get(
                ListGetParams.builder().listId("listId").includeFilters(true).build()
            )

        val listFetchResponse = listFetchResponseFuture.get()
        listFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByObjectTypeAndName() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val listFetchResponseFuture =
            listServiceAsync.getByObjectTypeAndName(
                ListGetByObjectTypeAndNameParams.builder()
                    .objectTypeId("objectTypeId")
                    .listName("listName")
                    .includeFilters(true)
                    .build()
            )

        val listFetchResponse = listFetchResponseFuture.get()
        listFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getIdMapping() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val publicMigrationMappingFuture =
            listServiceAsync.getIdMapping(
                ListGetIdMappingParams.builder().legacyListId("legacyListId").build()
            )

        val publicMigrationMapping = publicMigrationMappingFuture.get()
        publicMigrationMapping.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getMembershipsJoinOrder() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val pageFuture = listServiceAsync.getMembershipsJoinOrder("listId")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getRecordMemberships() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val apiCollectionResponseRecordListMembershipFuture =
            listServiceAsync.getRecordMemberships(
                ListGetRecordMembershipsParams.builder()
                    .objectTypeId("objectTypeId")
                    .recordId("recordId")
                    .build()
            )

        val apiCollectionResponseRecordListMembership =
            apiCollectionResponseRecordListMembershipFuture.get()
        apiCollectionResponseRecordListMembership.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getScheduleConversion() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val publicListConversionResponseFuture = listServiceAsync.getScheduleConversion("listId")

        val publicListConversionResponse = publicListConversionResponseFuture.get()
        publicListConversionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSizeAndEditsHistoryBetween() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val listSizeAndEditHistoryResponseFuture =
            listServiceAsync.getSizeAndEditsHistoryBetween(
                ListGetSizeAndEditsHistoryBetweenParams.builder()
                    .listId("listId")
                    .endDate("endDate")
                    .startDate("startDate")
                    .build()
            )

        val listSizeAndEditHistoryResponse = listSizeAndEditHistoryResponseFuture.get()
        listSizeAndEditHistoryResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listBySearch() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val listSearchResponseFuture =
            listServiceAsync.listBySearch(
                ListSearchRequest.builder()
                    .addListId("string")
                    .offset(0)
                    .addProcessingType("string")
                    .addAdditionalFilterProperty("string")
                    .count(0)
                    .objectTypeId("objectTypeId")
                    .query("query")
                    .sort("sort")
                    .build()
            )

        val listSearchResponse = listSearchResponseFuture.get()
        listSearchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listFolders() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val listFolderFetchResponseFuture =
            listServiceAsync.listFolders(
                ListListFoldersParams.builder().folderId("folderId").build()
            )

        val listFolderFetchResponse = listFolderFetchResponseFuture.get()
        listFolderFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listMemberships() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val pageFuture = listServiceAsync.listMemberships("listId")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun moveFolder() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val listFolderFetchResponseFuture =
            listServiceAsync.moveFolder(
                ListMoveFolderParams.builder()
                    .folderId("folderId")
                    .newParentFolderId("newParentFolderId")
                    .build()
            )

        val listFolderFetchResponse = listFolderFetchResponseFuture.get()
        listFolderFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun moveList() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val future =
            listServiceAsync.moveList(
                ListMoveRequest.builder().listId("listId").newFolderId("newFolderId").build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun removeMemberships() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val membershipsUpdateResponseFuture =
            listServiceAsync.removeMemberships(
                ListRemoveMembershipsParams.builder().listId("listId").addBody("string").build()
            )

        val membershipsUpdateResponse = membershipsUpdateResponseFuture.get()
        membershipsUpdateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun renameFolder() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val listFolderFetchResponseFuture =
            listServiceAsync.renameFolder(
                ListRenameFolderParams.builder()
                    .folderId("folderId")
                    .newFolderName("newFolderName")
                    .build()
            )

        val listFolderFetchResponse = listFolderFetchResponseFuture.get()
        listFolderFetchResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restore() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val future = listServiceAsync.restore("listId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun scheduleConversion() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val future = listServiceAsync.scheduleConversion("listId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateListFilters() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val listUpdateResponseFuture =
            listServiceAsync.updateListFilters(
                ListUpdateListFiltersParams.builder()
                    .listId("listId")
                    .enrollObjectsInWorkflows(true)
                    .listFilterUpdateRequest(
                        ListFilterUpdateRequest.builder()
                            .filterBranch(
                                PublicOrFilterBranch.builder()
                                    .addFilterBranch(
                                        PublicAndFilterBranch.builder()
                                            .addFilterBranch(
                                                PublicNotAllFilterBranch.builder()
                                                    .addFilterBranch(
                                                        PublicNotAnyFilterBranch.builder()
                                                            .addFilterBranch(
                                                                PublicRestrictedFilterBranch
                                                                    .builder()
                                                                    .addFilterBranch(
                                                                        PublicUnifiedEventsFilterBranch
                                                                            .builder()
                                                                            .eventTypeId(
                                                                                "eventTypeId"
                                                                            )
                                                                            .addFilterBranch(
                                                                                PublicPropertyAssociationFilterBranch
                                                                                    .builder()
                                                                                    .addFilterBranch(
                                                                                        PublicAssociationFilterBranch
                                                                                            .builder()
                                                                                            .associationCategory(
                                                                                                "associationCategory"
                                                                                            )
                                                                                            .associationTypeId(
                                                                                                0
                                                                                            )
                                                                                            .addFilterBranch(
                                                                                                PublicOrFilterBranch
                                                                                                    .builder()
                                                                                                    .filterBranches(
                                                                                                        listOf()
                                                                                                    )
                                                                                                    .filterBranchOperator(
                                                                                                        "filterBranchOperator"
                                                                                                    )
                                                                                                    .filterBranchType(
                                                                                                        PublicOrFilterBranch
                                                                                                            .FilterBranchType
                                                                                                            .OR
                                                                                                    )
                                                                                                    .addFilter(
                                                                                                        PublicPropertyFilter
                                                                                                            .builder()
                                                                                                            .filterType(
                                                                                                                PublicPropertyFilter
                                                                                                                    .FilterType
                                                                                                                    .PROPERTY
                                                                                                            )
                                                                                                            .operation(
                                                                                                                PublicBoolPropertyOperation
                                                                                                                    .builder()
                                                                                                                    .includeObjectsWithNoValueSet(
                                                                                                                        true
                                                                                                                    )
                                                                                                                    .operationType(
                                                                                                                        PublicBoolPropertyOperation
                                                                                                                            .OperationType
                                                                                                                            .BOOL
                                                                                                                    )
                                                                                                                    .operator(
                                                                                                                        "operator"
                                                                                                                    )
                                                                                                                    .value(
                                                                                                                        true
                                                                                                                    )
                                                                                                                    .build()
                                                                                                            )
                                                                                                            .property(
                                                                                                                "property"
                                                                                                            )
                                                                                                            .build()
                                                                                                    )
                                                                                                    .build()
                                                                                            )
                                                                                            .filterBranchOperator(
                                                                                                "filterBranchOperator"
                                                                                            )
                                                                                            .filterBranchType(
                                                                                                PublicAssociationFilterBranch
                                                                                                    .FilterBranchType
                                                                                                    .ASSOCIATION
                                                                                            )
                                                                                            .addFilter(
                                                                                                PublicPropertyFilter
                                                                                                    .builder()
                                                                                                    .filterType(
                                                                                                        PublicPropertyFilter
                                                                                                            .FilterType
                                                                                                            .PROPERTY
                                                                                                    )
                                                                                                    .operation(
                                                                                                        PublicBoolPropertyOperation
                                                                                                            .builder()
                                                                                                            .includeObjectsWithNoValueSet(
                                                                                                                true
                                                                                                            )
                                                                                                            .operationType(
                                                                                                                PublicBoolPropertyOperation
                                                                                                                    .OperationType
                                                                                                                    .BOOL
                                                                                                            )
                                                                                                            .operator(
                                                                                                                "operator"
                                                                                                            )
                                                                                                            .value(
                                                                                                                true
                                                                                                            )
                                                                                                            .build()
                                                                                                    )
                                                                                                    .property(
                                                                                                        "property"
                                                                                                    )
                                                                                                    .build()
                                                                                            )
                                                                                            .objectTypeId(
                                                                                                "objectTypeId"
                                                                                            )
                                                                                            .operator(
                                                                                                "operator"
                                                                                            )
                                                                                            .build()
                                                                                    )
                                                                                    .filterBranchOperator(
                                                                                        "filterBranchOperator"
                                                                                    )
                                                                                    .filterBranchType(
                                                                                        PublicPropertyAssociationFilterBranch
                                                                                            .FilterBranchType
                                                                                            .PROPERTY_ASSOCIATION
                                                                                    )
                                                                                    .addFilter(
                                                                                        PublicPropertyFilter
                                                                                            .builder()
                                                                                            .filterType(
                                                                                                PublicPropertyFilter
                                                                                                    .FilterType
                                                                                                    .PROPERTY
                                                                                            )
                                                                                            .operation(
                                                                                                PublicBoolPropertyOperation
                                                                                                    .builder()
                                                                                                    .includeObjectsWithNoValueSet(
                                                                                                        true
                                                                                                    )
                                                                                                    .operationType(
                                                                                                        PublicBoolPropertyOperation
                                                                                                            .OperationType
                                                                                                            .BOOL
                                                                                                    )
                                                                                                    .operator(
                                                                                                        "operator"
                                                                                                    )
                                                                                                    .value(
                                                                                                        true
                                                                                                    )
                                                                                                    .build()
                                                                                            )
                                                                                            .property(
                                                                                                "property"
                                                                                            )
                                                                                            .build()
                                                                                    )
                                                                                    .objectTypeId(
                                                                                        "objectTypeId"
                                                                                    )
                                                                                    .operator(
                                                                                        "operator"
                                                                                    )
                                                                                    .propertyWithObjectId(
                                                                                        "propertyWithObjectId"
                                                                                    )
                                                                                    .build()
                                                                            )
                                                                            .filterBranchOperator(
                                                                                "filterBranchOperator"
                                                                            )
                                                                            .filterBranchType(
                                                                                PublicUnifiedEventsFilterBranch
                                                                                    .FilterBranchType
                                                                                    .UNIFIED_EVENTS
                                                                            )
                                                                            .addFilter(
                                                                                PublicPropertyFilter
                                                                                    .builder()
                                                                                    .filterType(
                                                                                        PublicPropertyFilter
                                                                                            .FilterType
                                                                                            .PROPERTY
                                                                                    )
                                                                                    .operation(
                                                                                        PublicBoolPropertyOperation
                                                                                            .builder()
                                                                                            .includeObjectsWithNoValueSet(
                                                                                                true
                                                                                            )
                                                                                            .operationType(
                                                                                                PublicBoolPropertyOperation
                                                                                                    .OperationType
                                                                                                    .BOOL
                                                                                            )
                                                                                            .operator(
                                                                                                "operator"
                                                                                            )
                                                                                            .value(
                                                                                                true
                                                                                            )
                                                                                            .build()
                                                                                    )
                                                                                    .property(
                                                                                        "property"
                                                                                    )
                                                                                    .build()
                                                                            )
                                                                            .operator(
                                                                                PublicUnifiedEventsFilterBranch
                                                                                    .Operator
                                                                                    .HAS_COMPLETED
                                                                            )
                                                                            .coalescingRefineBy(
                                                                                PublicNumOccurrencesRefineBy
                                                                                    .builder()
                                                                                    .type(
                                                                                        PublicNumOccurrencesRefineBy
                                                                                            .Type
                                                                                            .NUM_OCCURRENCES
                                                                                    )
                                                                                    .maxOccurrences(
                                                                                        0
                                                                                    )
                                                                                    .minOccurrences(
                                                                                        0
                                                                                    )
                                                                                    .build()
                                                                            )
                                                                            .pruningRefineBy(
                                                                                PublicNumOccurrencesRefineBy
                                                                                    .builder()
                                                                                    .type(
                                                                                        PublicNumOccurrencesRefineBy
                                                                                            .Type
                                                                                            .NUM_OCCURRENCES
                                                                                    )
                                                                                    .maxOccurrences(
                                                                                        0
                                                                                    )
                                                                                    .minOccurrences(
                                                                                        0
                                                                                    )
                                                                                    .build()
                                                                            )
                                                                            .build()
                                                                    )
                                                                    .filterBranchOperator(
                                                                        "filterBranchOperator"
                                                                    )
                                                                    .filterBranchType(
                                                                        PublicRestrictedFilterBranch
                                                                            .FilterBranchType
                                                                            .RESTRICTED
                                                                    )
                                                                    .addFilter(
                                                                        PublicPropertyFilter
                                                                            .builder()
                                                                            .filterType(
                                                                                PublicPropertyFilter
                                                                                    .FilterType
                                                                                    .PROPERTY
                                                                            )
                                                                            .operation(
                                                                                PublicBoolPropertyOperation
                                                                                    .builder()
                                                                                    .includeObjectsWithNoValueSet(
                                                                                        true
                                                                                    )
                                                                                    .operationType(
                                                                                        PublicBoolPropertyOperation
                                                                                            .OperationType
                                                                                            .BOOL
                                                                                    )
                                                                                    .operator(
                                                                                        "operator"
                                                                                    )
                                                                                    .value(true)
                                                                                    .build()
                                                                            )
                                                                            .property("property")
                                                                            .build()
                                                                    )
                                                                    .build()
                                                            )
                                                            .filterBranchOperator(
                                                                "filterBranchOperator"
                                                            )
                                                            .filterBranchType(
                                                                PublicNotAnyFilterBranch
                                                                    .FilterBranchType
                                                                    .NOT_ANY
                                                            )
                                                            .addFilter(
                                                                PublicPropertyFilter.builder()
                                                                    .filterType(
                                                                        PublicPropertyFilter
                                                                            .FilterType
                                                                            .PROPERTY
                                                                    )
                                                                    .operation(
                                                                        PublicBoolPropertyOperation
                                                                            .builder()
                                                                            .includeObjectsWithNoValueSet(
                                                                                true
                                                                            )
                                                                            .operationType(
                                                                                PublicBoolPropertyOperation
                                                                                    .OperationType
                                                                                    .BOOL
                                                                            )
                                                                            .operator("operator")
                                                                            .value(true)
                                                                            .build()
                                                                    )
                                                                    .property("property")
                                                                    .build()
                                                            )
                                                            .build()
                                                    )
                                                    .filterBranchOperator("filterBranchOperator")
                                                    .filterBranchType(
                                                        PublicNotAllFilterBranch.FilterBranchType
                                                            .NOT_ALL
                                                    )
                                                    .addFilter(
                                                        PublicPropertyFilter.builder()
                                                            .filterType(
                                                                PublicPropertyFilter.FilterType
                                                                    .PROPERTY
                                                            )
                                                            .operation(
                                                                PublicBoolPropertyOperation
                                                                    .builder()
                                                                    .includeObjectsWithNoValueSet(
                                                                        true
                                                                    )
                                                                    .operationType(
                                                                        PublicBoolPropertyOperation
                                                                            .OperationType
                                                                            .BOOL
                                                                    )
                                                                    .operator("operator")
                                                                    .value(true)
                                                                    .build()
                                                            )
                                                            .property("property")
                                                            .build()
                                                    )
                                                    .build()
                                            )
                                            .filterBranchOperator("filterBranchOperator")
                                            .filterBranchType(
                                                PublicAndFilterBranch.FilterBranchType.AND
                                            )
                                            .addFilter(
                                                PublicPropertyFilter.builder()
                                                    .filterType(
                                                        PublicPropertyFilter.FilterType.PROPERTY
                                                    )
                                                    .operation(
                                                        PublicBoolPropertyOperation.builder()
                                                            .includeObjectsWithNoValueSet(true)
                                                            .operationType(
                                                                PublicBoolPropertyOperation
                                                                    .OperationType
                                                                    .BOOL
                                                            )
                                                            .operator("operator")
                                                            .value(true)
                                                            .build()
                                                    )
                                                    .property("property")
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .filterBranchOperator("filterBranchOperator")
                                    .filterBranchType(PublicOrFilterBranch.FilterBranchType.OR)
                                    .addFilter(
                                        PublicPropertyFilter.builder()
                                            .filterType(PublicPropertyFilter.FilterType.PROPERTY)
                                            .operation(
                                                PublicBoolPropertyOperation.builder()
                                                    .includeObjectsWithNoValueSet(true)
                                                    .operationType(
                                                        PublicBoolPropertyOperation.OperationType
                                                            .BOOL
                                                    )
                                                    .operator("operator")
                                                    .value(true)
                                                    .build()
                                            )
                                            .property("property")
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val listUpdateResponse = listUpdateResponseFuture.get()
        listUpdateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateListName() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val listUpdateResponseFuture =
            listServiceAsync.updateListName(
                ListUpdateListNameParams.builder()
                    .listId("listId")
                    .includeFilters(true)
                    .listName("listName")
                    .build()
            )

        val listUpdateResponse = listUpdateResponseFuture.get()
        listUpdateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateScheduleConversion() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val listServiceAsync = client.crm().lists()

        val publicListConversionResponseFuture =
            listServiceAsync.updateScheduleConversion(
                ListUpdateScheduleConversionParams.builder()
                    .listId("listId")
                    .publicListConversionTime(
                        PublicListConversionDate.builder()
                            .conversionType(PublicListConversionDate.ConversionType.CONVERSION_DATE)
                            .day(0)
                            .month(0)
                            .year(0)
                            .build()
                    )
                    .build()
            )

        val publicListConversionResponse = publicListConversionResponseFuture.get()
        publicListConversionResponse.validate()
    }
}
