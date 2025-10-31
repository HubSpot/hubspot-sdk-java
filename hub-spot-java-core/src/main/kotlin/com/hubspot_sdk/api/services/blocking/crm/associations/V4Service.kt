// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.associations

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.BatchResponsePublicDefaultAssociation
import com.hubspot_sdk.api.models.crm.CreatedResponseLabelsBetweenObjectPair
import com.hubspot_sdk.api.models.crm.associations.v4.V4CreateParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4DeleteParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4ListPage
import com.hubspot_sdk.api.models.crm.associations.v4.V4ListParams
import com.hubspot_sdk.api.models.crm.associations.v4.V4UpdateParams
import com.hubspot_sdk.api.services.blocking.crm.associations.v4.BatchService
import com.hubspot_sdk.api.services.blocking.crm.associations.v4.ReportService
import java.util.function.Consumer

interface V4Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4Service

    fun batch(): BatchService

    fun report(): ReportService

    /** Create the default (most generic) association type between two object types */
    fun create(toObjectId: String, params: V4CreateParams): BatchResponsePublicDefaultAssociation =
        create(toObjectId, params, RequestOptions.none())

    /** @see create */
    fun create(
        toObjectId: String,
        params: V4CreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicDefaultAssociation =
        create(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

    /** @see create */
    fun create(params: V4CreateParams): BatchResponsePublicDefaultAssociation =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: V4CreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePublicDefaultAssociation

    /** Set association labels between two records. */
    fun update(toObjectId: String, params: V4UpdateParams): CreatedResponseLabelsBetweenObjectPair =
        update(toObjectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        toObjectId: String,
        params: V4UpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreatedResponseLabelsBetweenObjectPair =
        update(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

    /** @see update */
    fun update(params: V4UpdateParams): CreatedResponseLabelsBetweenObjectPair =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: V4UpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreatedResponseLabelsBetweenObjectPair

    /** List all associations of an object by object type. Limit 500 per call. */
    fun list(toObjectType: String, params: V4ListParams): V4ListPage =
        list(toObjectType, params, RequestOptions.none())

    /** @see list */
    fun list(
        toObjectType: String,
        params: V4ListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V4ListPage = list(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

    /** @see list */
    fun list(params: V4ListParams): V4ListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: V4ListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V4ListPage

    /** deletes all associations between two records. */
    fun delete(toObjectId: String, params: V4DeleteParams) =
        delete(toObjectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        toObjectId: String,
        params: V4DeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

    /** @see delete */
    fun delete(params: V4DeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(params: V4DeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** A view of [V4Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V4Service.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        fun report(): ReportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /crm/v4/objects/{fromObjectType}/{fromObjectId}/associations/default/{toObjectType}/{toObjectId}`,
         * but is otherwise the same as [V4Service.create].
         */
        @MustBeClosed
        fun create(
            toObjectId: String,
            params: V4CreateParams,
        ): HttpResponseFor<BatchResponsePublicDefaultAssociation> =
            create(toObjectId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            toObjectId: String,
            params: V4CreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicDefaultAssociation> =
            create(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: V4CreateParams): HttpResponseFor<BatchResponsePublicDefaultAssociation> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: V4CreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePublicDefaultAssociation>

        /**
         * Returns a raw HTTP response for `put
         * /crm/v4/objects/{objectType}/{objectId}/associations/{toObjectType}/{toObjectId}`, but is
         * otherwise the same as [V4Service.update].
         */
        @MustBeClosed
        fun update(
            toObjectId: String,
            params: V4UpdateParams,
        ): HttpResponseFor<CreatedResponseLabelsBetweenObjectPair> =
            update(toObjectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            toObjectId: String,
            params: V4UpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreatedResponseLabelsBetweenObjectPair> =
            update(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: V4UpdateParams
        ): HttpResponseFor<CreatedResponseLabelsBetweenObjectPair> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: V4UpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreatedResponseLabelsBetweenObjectPair>

        /**
         * Returns a raw HTTP response for `get
         * /crm/v4/objects/{objectType}/{objectId}/associations/{toObjectType}`, but is otherwise
         * the same as [V4Service.list].
         */
        @MustBeClosed
        fun list(toObjectType: String, params: V4ListParams): HttpResponseFor<V4ListPage> =
            list(toObjectType, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            toObjectType: String,
            params: V4ListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V4ListPage> =
            list(params.toBuilder().toObjectType(toObjectType).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(params: V4ListParams): HttpResponseFor<V4ListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: V4ListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V4ListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /crm/v4/objects/{objectType}/{objectId}/associations/{toObjectType}/{toObjectId}`, but is
         * otherwise the same as [V4Service.delete].
         */
        @MustBeClosed
        fun delete(toObjectId: String, params: V4DeleteParams): HttpResponse =
            delete(toObjectId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            toObjectId: String,
            params: V4DeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().toObjectId(toObjectId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: V4DeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: V4DeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
