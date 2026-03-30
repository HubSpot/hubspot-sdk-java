// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.objects

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.CollectionResponseWithTotalSimplePublicObject
import com.hubspot_sdk.api.models.crm.PublicObjectSearchRequest
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectInputForCreate
import com.hubspot_sdk.api.models.crm.objects.SimplePublicObjectWithAssociations
import com.hubspot_sdk.api.models.crm.objects.emails.EmailCreateParams
import com.hubspot_sdk.api.models.crm.objects.emails.EmailDeleteParams
import com.hubspot_sdk.api.models.crm.objects.emails.EmailGetParams
import com.hubspot_sdk.api.models.crm.objects.emails.EmailListPage
import com.hubspot_sdk.api.models.crm.objects.emails.EmailListParams
import com.hubspot_sdk.api.models.crm.objects.emails.EmailSearchParams
import com.hubspot_sdk.api.models.crm.objects.emails.EmailUpdateParams
import com.hubspot_sdk.api.services.blocking.crm.objects.emails.BatchService
import java.util.function.Consumer

interface EmailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailService

    fun batch(): BatchService

    /**
     * Create a email with the given properties and return a copy of the object, including the ID.
     * Documentation and examples for creating standard emails is provided.
     */
    fun create(params: EmailCreateParams): SimplePublicObject =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: EmailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject =
        create(
            EmailCreateParams.builder()
                .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
    ): SimplePublicObject = create(simplePublicObjectInputForCreate, RequestOptions.none())

    /**
     * Perform a partial update of an Object identified by `{emailId}`or optionally a unique
     * property value as specified by the `idProperty` query param. `{emailId}` refers to the
     * internal object ID by default, and the `idProperty` query param refers to a property whose
     * values are unique for the object. Provided property values will be overwritten. Read-only and
     * non-existent properties will result in an error. Properties values can be cleared by passing
     * an empty string.
     */
    fun update(emailId: String, params: EmailUpdateParams): SimplePublicObject =
        update(emailId, params, RequestOptions.none())

    /** @see update */
    fun update(
        emailId: String,
        params: EmailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject = update(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see update */
    fun update(params: EmailUpdateParams): SimplePublicObject =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: EmailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObject

    /** Read a page of emails. Control what is returned via the `properties` query param. */
    fun list(): EmailListPage = list(EmailListParams.none())

    /** @see list */
    fun list(
        params: EmailListParams = EmailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmailListPage

    /** @see list */
    fun list(params: EmailListParams = EmailListParams.none()): EmailListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): EmailListPage =
        list(EmailListParams.none(), requestOptions)

    /** Move an Object identified by `{emailId}` to the recycling bin. */
    fun delete(emailId: String) = delete(emailId, EmailDeleteParams.none())

    /** @see delete */
    fun delete(
        emailId: String,
        params: EmailDeleteParams = EmailDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see delete */
    fun delete(emailId: String, params: EmailDeleteParams = EmailDeleteParams.none()) =
        delete(emailId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: EmailDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: EmailDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(emailId: String, requestOptions: RequestOptions) =
        delete(emailId, EmailDeleteParams.none(), requestOptions)

    /**
     * Read an Object identified by `{emailId}`. `{emailId}` refers to the internal object ID by
     * default, or optionally any unique property value as specified by the `idProperty` query
     * param. Control what is returned via the `properties` query param.
     */
    fun get(emailId: String): SimplePublicObjectWithAssociations =
        get(emailId, EmailGetParams.none())

    /** @see get */
    fun get(
        emailId: String,
        params: EmailGetParams = EmailGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations =
        get(params.toBuilder().emailId(emailId).build(), requestOptions)

    /** @see get */
    fun get(
        emailId: String,
        params: EmailGetParams = EmailGetParams.none(),
    ): SimplePublicObjectWithAssociations = get(emailId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: EmailGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimplePublicObjectWithAssociations

    /** @see get */
    fun get(params: EmailGetParams): SimplePublicObjectWithAssociations =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(emailId: String, requestOptions: RequestOptions): SimplePublicObjectWithAssociations =
        get(emailId, EmailGetParams.none(), requestOptions)

    /**
     * Perform a search for emails based on the provided query parameters and return matching
     * results.
     */
    fun search(params: EmailSearchParams): CollectionResponseWithTotalSimplePublicObject =
        search(params, RequestOptions.none())

    /** @see search */
    fun search(
        params: EmailSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalSimplePublicObject =
        search(
            EmailSearchParams.builder()
                .publicObjectSearchRequest(publicObjectSearchRequest)
                .build(),
            requestOptions,
        )

    /** @see search */
    fun search(
        publicObjectSearchRequest: PublicObjectSearchRequest
    ): CollectionResponseWithTotalSimplePublicObject =
        search(publicObjectSearchRequest, RequestOptions.none())

    /** A view of [EmailService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EmailService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/emails`, but is otherwise the
         * same as [EmailService.create].
         */
        @MustBeClosed
        fun create(params: EmailCreateParams): HttpResponseFor<SimplePublicObject> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: EmailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            create(
                EmailCreateParams.builder()
                    .simplePublicObjectInputForCreate(simplePublicObjectInputForCreate)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            simplePublicObjectInputForCreate: SimplePublicObjectInputForCreate
        ): HttpResponseFor<SimplePublicObject> =
            create(simplePublicObjectInputForCreate, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /crm/objects/2026-03/emails/{emailId}`, but is
         * otherwise the same as [EmailService.update].
         */
        @MustBeClosed
        fun update(
            emailId: String,
            params: EmailUpdateParams,
        ): HttpResponseFor<SimplePublicObject> = update(emailId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            emailId: String,
            params: EmailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject> =
            update(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: EmailUpdateParams): HttpResponseFor<SimplePublicObject> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: EmailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObject>

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/emails`, but is otherwise the
         * same as [EmailService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<EmailListPage> = list(EmailListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: EmailListParams = EmailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmailListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: EmailListParams = EmailListParams.none()): HttpResponseFor<EmailListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EmailListPage> =
            list(EmailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /crm/objects/2026-03/emails/{emailId}`, but is
         * otherwise the same as [EmailService.delete].
         */
        @MustBeClosed
        fun delete(emailId: String): HttpResponse = delete(emailId, EmailDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            emailId: String,
            params: EmailDeleteParams = EmailDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            emailId: String,
            params: EmailDeleteParams = EmailDeleteParams.none(),
        ): HttpResponse = delete(emailId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: EmailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: EmailDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(emailId: String, requestOptions: RequestOptions): HttpResponse =
            delete(emailId, EmailDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /crm/objects/2026-03/emails/{emailId}`, but is
         * otherwise the same as [EmailService.get].
         */
        @MustBeClosed
        fun get(emailId: String): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(emailId, EmailGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            emailId: String,
            params: EmailGetParams = EmailGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params.toBuilder().emailId(emailId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            emailId: String,
            params: EmailGetParams = EmailGetParams.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(emailId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: EmailGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SimplePublicObjectWithAssociations>

        /** @see get */
        @MustBeClosed
        fun get(params: EmailGetParams): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            emailId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimplePublicObjectWithAssociations> =
            get(emailId, EmailGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /crm/objects/2026-03/emails/search`, but is
         * otherwise the same as [EmailService.search].
         */
        @MustBeClosed
        fun search(
            params: EmailSearchParams
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: EmailSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject>

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(
                EmailSearchParams.builder()
                    .publicObjectSearchRequest(publicObjectSearchRequest)
                    .build(),
                requestOptions,
            )

        /** @see search */
        @MustBeClosed
        fun search(
            publicObjectSearchRequest: PublicObjectSearchRequest
        ): HttpResponseFor<CollectionResponseWithTotalSimplePublicObject> =
            search(publicObjectSearchRequest, RequestOptions.none())
    }
}
