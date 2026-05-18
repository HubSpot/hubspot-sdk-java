// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.crm

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.crm.BatchResponsePublicDefaultAssociation
import com.hubspot.sdk.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot.sdk.models.crm.LabelsBetweenObjectPair
import com.hubspot.sdk.models.crm.ReportCreationResponse
import com.hubspot.sdk.models.crm.associations.AssociationCreateParams
import com.hubspot.sdk.models.crm.associations.AssociationDeleteParams
import com.hubspot.sdk.models.crm.associations.AssociationListPageAsync
import com.hubspot.sdk.models.crm.associations.AssociationListParams
import com.hubspot.sdk.models.crm.associations.AssociationRequestHighUsageReportParams
import com.hubspot.sdk.models.crm.associations.AssociationSearchParams
import com.hubspot.sdk.models.crm.associations.AssociationUpdateLabelsParams
import com.hubspot.sdk.services.async.crm.associations.BatchServiceAsync
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

    /** Create the default (most generic) association type between two object types */
    fun create(
        toObjectId: String,
        params: AssociationCreateParams,
    ): CompletableFuture<BatchResponsePublicDefaultAssociation> =
        create(toObjectId, params, RequestOptions.none())

    /** @see create */
    fun create(
        toObjectId: String,
        params: AssociationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicDefaultAssociation> =
        create(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

    /** @see create */
    fun create(
        params: AssociationCreateParams
    ): CompletableFuture<BatchResponsePublicDefaultAssociation> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AssociationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePublicDefaultAssociation>

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

    /** deletes all associations between two records. */
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

    /** Set association labels between two records. */
    fun updateLabels(
        toObjectId: String,
        params: AssociationUpdateLabelsParams,
    ): CompletableFuture<LabelsBetweenObjectPair> =
        updateLabels(toObjectId, params, RequestOptions.none())

    /** @see updateLabels */
    fun updateLabels(
        toObjectId: String,
        params: AssociationUpdateLabelsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LabelsBetweenObjectPair> =
        updateLabels(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

    /** @see updateLabels */
    fun updateLabels(
        params: AssociationUpdateLabelsParams
    ): CompletableFuture<LabelsBetweenObjectPair> = updateLabels(params, RequestOptions.none())

    /** @see updateLabels */
    fun updateLabels(
        params: AssociationUpdateLabelsParams,
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
         * Returns a raw HTTP response for `put
         * /crm/objects/2026-03/{fromObjectType}/{fromObjectId}/associations/default/{toObjectType}/{toObjectId}`,
         * but is otherwise the same as [AssociationServiceAsync.create].
         */
        fun create(
            toObjectId: String,
            params: AssociationCreateParams,
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>> =
            create(toObjectId, params, RequestOptions.none())

        /** @see create */
        fun create(
            toObjectId: String,
            params: AssociationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>> =
            create(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

        /** @see create */
        fun create(
            params: AssociationCreateParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AssociationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePublicDefaultAssociation>>

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
         * but is otherwise the same as [AssociationServiceAsync.updateLabels].
         */
        fun updateLabels(
            toObjectId: String,
            params: AssociationUpdateLabelsParams,
        ): CompletableFuture<HttpResponseFor<LabelsBetweenObjectPair>> =
            updateLabels(toObjectId, params, RequestOptions.none())

        /** @see updateLabels */
        fun updateLabels(
            toObjectId: String,
            params: AssociationUpdateLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LabelsBetweenObjectPair>> =
            updateLabels(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

        /** @see updateLabels */
        fun updateLabels(
            params: AssociationUpdateLabelsParams
        ): CompletableFuture<HttpResponseFor<LabelsBetweenObjectPair>> =
            updateLabels(params, RequestOptions.none())

        /** @see updateLabels */
        fun updateLabels(
            params: AssociationUpdateLabelsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LabelsBetweenObjectPair>>
    }
}
