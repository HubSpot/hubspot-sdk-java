// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.services.blocking.crm.ObjectService
import com.hubspot_sdk.api.services.blocking.crm.objects.CallService
import com.hubspot_sdk.api.services.blocking.crm.objects.CartService
import com.hubspot_sdk.api.services.blocking.crm.objects.CommercePaymentService
import com.hubspot_sdk.api.services.blocking.crm.objects.CommunicationService
import com.hubspot_sdk.api.services.blocking.crm.objects.CompanyService
import com.hubspot_sdk.api.services.blocking.crm.objects.ContactService
import com.hubspot_sdk.api.services.blocking.crm.objects.ContractService
import com.hubspot_sdk.api.services.blocking.crm.objects.CourseService
import com.hubspot_sdk.api.services.blocking.crm.objects.CustomService
import com.hubspot_sdk.api.services.blocking.crm.objects.DealService
import com.hubspot_sdk.api.services.blocking.crm.objects.DiscountService
import com.hubspot_sdk.api.services.blocking.crm.objects.EmailService
import com.hubspot_sdk.api.services.blocking.crm.objects.FeeService
import com.hubspot_sdk.api.services.blocking.crm.objects.FeedbackSubmissionService
import com.hubspot_sdk.api.services.blocking.crm.objects.GoalTargetService
import com.hubspot_sdk.api.services.blocking.crm.objects.InvoiceService
import com.hubspot_sdk.api.services.blocking.crm.objects.LeadService
import com.hubspot_sdk.api.services.blocking.crm.objects.LineItemService
import com.hubspot_sdk.api.services.blocking.crm.objects.ListingService
import com.hubspot_sdk.api.services.blocking.crm.objects.MeetingService
import com.hubspot_sdk.api.services.blocking.crm.objects.NoteService
import com.hubspot_sdk.api.services.blocking.crm.objects.ObjectService
import com.hubspot_sdk.api.services.blocking.crm.objects.OrderService
import com.hubspot_sdk.api.services.blocking.crm.objects.PartnerClientService
import com.hubspot_sdk.api.services.blocking.crm.objects.PartnerServiceService
import com.hubspot_sdk.api.services.blocking.crm.objects.PostalMailService
import com.hubspot_sdk.api.services.blocking.crm.objects.ProductService
import com.hubspot_sdk.api.services.blocking.crm.objects.ProjectService
import com.hubspot_sdk.api.services.blocking.crm.objects.QuoteService
import com.hubspot_sdk.api.services.blocking.crm.objects.ServiceService
import com.hubspot_sdk.api.services.blocking.crm.objects.SubscriptionService
import com.hubspot_sdk.api.services.blocking.crm.objects.TaskService
import com.hubspot_sdk.api.services.blocking.crm.objects.TaxService
import com.hubspot_sdk.api.services.blocking.crm.objects.TicketService
import com.hubspot_sdk.api.services.blocking.crm.objects.UserService
import java.util.function.Consumer

interface ObjectService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectService

    fun calls(): CallService

    fun carts(): CartService

    fun commercePayments(): CommercePaymentService

    fun communications(): CommunicationService

    fun companies(): CompanyService

    fun contacts(): ContactService

    fun contracts(): ContractService

    fun courses(): CourseService

    fun custom(): CustomService

    fun deals(): DealService

    fun discounts(): DiscountService

    fun emails(): EmailService

    fun feedbackSubmissions(): FeedbackSubmissionService

    fun fees(): FeeService

    fun goalTargets(): GoalTargetService

    fun invoices(): InvoiceService

    fun leads(): LeadService

    fun lineItems(): LineItemService

    fun listings(): ListingService

    fun meetings(): MeetingService

    fun notes(): NoteService

    fun objects(): ObjectService

    fun orders(): OrderService

    fun partnerClients(): PartnerClientService

    fun partnerServices(): PartnerServiceService

    fun postalMail(): PostalMailService

    fun products(): ProductService

    fun projects(): ProjectService

    fun quotes(): QuoteService

    fun services(): ServiceService

    fun subscriptions(): SubscriptionService

    fun tasks(): TaskService

    fun taxes(): TaxService

    fun tickets(): TicketService

    fun users(): UserService

    /** A view of [ObjectService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObjectService.WithRawResponse

        fun calls(): CallService.WithRawResponse

        fun carts(): CartService.WithRawResponse

        fun commercePayments(): CommercePaymentService.WithRawResponse

        fun communications(): CommunicationService.WithRawResponse

        fun companies(): CompanyService.WithRawResponse

        fun contacts(): ContactService.WithRawResponse

        fun contracts(): ContractService.WithRawResponse

        fun courses(): CourseService.WithRawResponse

        fun custom(): CustomService.WithRawResponse

        fun deals(): DealService.WithRawResponse

        fun discounts(): DiscountService.WithRawResponse

        fun emails(): EmailService.WithRawResponse

        fun feedbackSubmissions(): FeedbackSubmissionService.WithRawResponse

        fun fees(): FeeService.WithRawResponse

        fun goalTargets(): GoalTargetService.WithRawResponse

        fun invoices(): InvoiceService.WithRawResponse

        fun leads(): LeadService.WithRawResponse

        fun lineItems(): LineItemService.WithRawResponse

        fun listings(): ListingService.WithRawResponse

        fun meetings(): MeetingService.WithRawResponse

        fun notes(): NoteService.WithRawResponse

        fun objects(): ObjectService.WithRawResponse

        fun orders(): OrderService.WithRawResponse

        fun partnerClients(): PartnerClientService.WithRawResponse

        fun partnerServices(): PartnerServiceService.WithRawResponse

        fun postalMail(): PostalMailService.WithRawResponse

        fun products(): ProductService.WithRawResponse

        fun projects(): ProjectService.WithRawResponse

        fun quotes(): QuoteService.WithRawResponse

        fun services(): ServiceService.WithRawResponse

        fun subscriptions(): SubscriptionService.WithRawResponse

        fun tasks(): TaskService.WithRawResponse

        fun taxes(): TaxService.WithRawResponse

        fun tickets(): TicketService.WithRawResponse

        fun users(): UserService.WithRawResponse
    }
}
