// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.LabelsBetweenObjectPair
import com.hubspot_sdk.api.models.crm.associations.AssociationDeleteParams
import com.hubspot_sdk.api.models.crm.associations.AssociationListPageAsync
import com.hubspot_sdk.api.models.crm.associations.AssociationListParams
import com.hubspot_sdk.api.models.crm.associations.AssociationRequestHighUsageReportParams
import com.hubspot_sdk.api.models.crm.associations.AssociationSearchParams
import com.hubspot_sdk.api.models.crm.associations.AssociationUpdateAssociationLabelsParams
import com.hubspot_sdk.api.models.crm.associations.ReportCreationResponse
import com.hubspot_sdk.api.services.async.crm.associations.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AssociationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AssociationServiceAsync

    fun batch(): BatchServiceAsync

    /**
     * Retrieve all associations between a specific record and an object type. Limit 500 per call.
     */
    fun list(
        toObjectType: String,
        params: AssociationListParams,
    ): CompletableFuture<AssociationListPageAsync> =
        list(toObjectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        toObjectType: String,
        params: AssociationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssociationListPageAsync> =
        list(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see list */
    fun list(params: AssociationListParams): CompletableFuture<AssociationListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: AssociationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AssociationListPageAsync>

    fun delete(toObjectId: String, params: AssociationDeleteParams): CompletableFuture<Void?> =
        delete(toObjectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        toObjectId: String,
        params: AssociationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

    /** @see delete */
    fun delete(params: AssociationDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AssociationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Requests a report of all objects in the portal which have a high usage of associations */
    fun requestHighUsageReport(userId: Int): CompletableFuture<ReportCreationResponse> =
        requestHighUsageReport(userId, AssociationRequestHighUsageReportParams.none())

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        userId: Int,
        params: AssociationRequestHighUsageReportParams =
            AssociationRequestHighUsageReportParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportCreationResponse> =
        requestHighUsageReport(params.toBuilder().userId(userId).build(), requestOptions)

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        userId: Int,
        params: AssociationRequestHighUsageReportParams =
            AssociationRequestHighUsageReportParams.none(),
    ): CompletableFuture<ReportCreationResponse> =
        requestHighUsageReport(userId, params, RequestOptions.none())

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        params: AssociationRequestHighUsageReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportCreationResponse>

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        params: AssociationRequestHighUsageReportParams
    ): CompletableFuture<ReportCreationResponse> =
        requestHighUsageReport(params, RequestOptions.none())

    /** @see requestHighUsageReport */
    fun requestHighUsageReport(
        userId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReportCreationResponse> =
        requestHighUsageReport(
            userId,
            AssociationRequestHighUsageReportParams.none(),
            requestOptions,
        )

    fun search(
        objectType: String,
        params: AssociationSearchParams,
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(objectType, params, RequestOptions.none())

    /** @see search */
    fun search(
        objectType: String,
        params: AssociationSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params.toBuilder().objectType(objectType).build(), requestOptions)

    /** @see search */
    fun search(
        params: AssociationSearchParams
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject> =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: AssociationSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalSimplePublicObject>

    fun updateAssociationLabels(
        toObjectId: String,
        params: AssociationUpdateAssociationLabelsParams,
    ): CompletableFuture<LabelsBetweenObjectPair> =
        updateAssociationLabels(toObjectId, params, RequestOptions.none())

    /** @see updateAssociationLabels */
    fun updateAssociationLabels(
        toObjectId: String,
        params: AssociationUpdateAssociationLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LabelsBetweenObjectPair> =
        updateAssociationLabels(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

    /** @see updateAssociationLabels */
    fun updateAssociationLabels(
        params: AssociationUpdateAssociationLabelsParams
    ): CompletableFuture<LabelsBetweenObjectPair> =
        updateAssociationLabels(params, RequestOptions.none())

    /** @see updateAssociationLabels */
    fun updateAssociationLabels(
        params: AssociationUpdateAssociationLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LabelsBetweenObjectPair>

    /**
     * A view of [AssociationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AssociationServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /crm/objects/2026-03/{objectType}/{objectId}/associations/{toObjectType}`, but is
         * otherwise the same as [AssociationServiceAsync.list].
         */
        fun list(
            toObjectType: String,
            params: AssociationListParams,
        ): CompletableFuture<HttpResponseFor<AssociationListPageAsync>> =
            list(toObjectType, params, RequestOptions.none())

        /** @see list */
        fun list(
            toObjectType: String,
            params: AssociationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssociationListPageAsync>> =
            list(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see list */
        fun list(
            params: AssociationListParams
        ): CompletableFuture<HttpResponseFor<AssociationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: AssociationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AssociationListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/objects/2026-03/{objectType}/{objectId}/associations/{toObjectType}/{toObjectId}`,
         * but is otherwise the same as [AssociationServiceAsync.delete].
         */
        fun delete(
            toObjectId: String,
            params: AssociationDeleteParams,
        ): CompletableFuture<HttpResponse> = delete(toObjectId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            toObjectId: String,
            params: AssociationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

        /** @see delete */
        fun delete(params: AssociationDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AssociationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /crm/associations/2026-03/usage/high-usage-report/{userId}`, but is otherwise the same as
         * [AssociationServiceAsync.requestHighUsageReport].
         */
        fun requestHighUsageReport(
            userId: Int
        ): CompletableFuture<HttpResponseFor<ReportCreationResponse>> =
            requestHighUsageReport(userId, AssociationRequestHighUsageReportParams.none())

        /** @see requestHighUsageReport */
        fun requestHighUsageReport(
            userId: Int,
            params: AssociationRequestHighUsageReportParams =
                AssociationRequestHighUsageReportParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportCreationResponse>> =
            requestHighUsageReport(params.toBuilder().userId(userId).build(), requestOptions)

        /** @see requestHighUsageReport */
        fun requestHighUsageReport(
            userId: Int,
            params: AssociationRequestHighUsageReportParams =
                AssociationRequestHighUsageReportParams.none(),
        ): CompletableFuture<HttpResponseFor<ReportCreationResponse>> =
            requestHighUsageReport(userId, params, RequestOptions.none())

        /** @see requestHighUsageReport */
        fun requestHighUsageReport(
            params: AssociationRequestHighUsageReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportCreationResponse>>

        /** @see requestHighUsageReport */
        fun requestHighUsageReport(
            params: AssociationRequestHighUsageReportParams
        ): CompletableFuture<HttpResponseFor<ReportCreationResponse>> =
            requestHighUsageReport(params, RequestOptions.none())

        /** @see requestHighUsageReport */
        fun requestHighUsageReport(
            userId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReportCreationResponse>> =
            requestHighUsageReport(
                userId,
                AssociationRequestHighUsageReportParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/{objectType}/search`, but is
         * otherwise the same as [AssociationServiceAsync.search].
         */
        fun search(
            objectType: String,
            params: AssociationSearchParams,
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(objectType, params, RequestOptions.none())

        /** @see search */
        fun search(
            objectType: String,
            params: AssociationSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params.toBuilder().objectType(objectType).build(), requestOptions)

        /** @see search */
        fun search(
            params: AssociationSearchParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            params: AssociationSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>>

        /**
         * Returns a raw HTTP response for `put
         * /crm/objects/2026-03/{objectType}/{objectId}/associations/{toObjectType}/{toObjectId}`,
         * but is otherwise the same as [AssociationServiceAsync.updateAssociationLabels].
         */
        fun updateAssociationLabels(
            toObjectId: String,
            params: AssociationUpdateAssociationLabelsParams,
        ): CompletableFuture<HttpResponseFor<LabelsBetweenObjectPair>> =
            updateAssociationLabels(toObjectId, params, RequestOptions.none())

        /** @see updateAssociationLabels */
        fun updateAssociationLabels(
            toObjectId: String,
            params: AssociationUpdateAssociationLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LabelsBetweenObjectPair>> =
            updateAssociationLabels(
                params.toBuilder().toObjectId(toObjectId).build(),
                requestOptions,
            )

        /** @see updateAssociationLabels */
        fun updateAssociationLabels(
            params: AssociationUpdateAssociationLabelsParams
        ): CompletableFuture<HttpResponseFor<LabelsBetweenObjectPair>> =
            updateAssociationLabels(params, RequestOptions.none())

        /** @see updateAssociationLabels */
        fun updateAssociationLabels(
            params: AssociationUpdateAssociationLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LabelsBetweenObjectPair>>
    }
}
